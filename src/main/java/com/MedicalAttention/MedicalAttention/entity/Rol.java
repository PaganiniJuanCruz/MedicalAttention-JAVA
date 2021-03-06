package com.MedicalAttention.MedicalAttention.entity;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "user")
    private Employee user;

    @Column(name = "rol")
    private String rol;

    public Rol() {
    }

    public Rol(String rol){
        this.user = null;
        this.rol = rol;
    }

    public Rol(Employee user, String licenses) {
        this.user = user;
        this.rol = licenses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    public String getRol() { return rol; }

    public void setRol(String rol) { this.rol = rol; }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", user=" + user +
                ", rol='" + rol + '\'' +
                '}';
    }
}
