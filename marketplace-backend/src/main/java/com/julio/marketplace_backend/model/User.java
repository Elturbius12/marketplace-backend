package com.julio.marketplace_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;   // ⚠️ En un proyecto real se encripta

    @Enumerated(EnumType.STRING)
    private UserRole role;

    // 🔹 Constructores

    public User() {
    }

    public User(String nombre, String email, String password, UserRole role) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // 🔹 Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
