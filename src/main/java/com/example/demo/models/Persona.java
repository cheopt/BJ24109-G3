package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("ALL")
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    public String getUsuario() {
        return usuario.toUpperCase();
    }

    @Column
    @Getter
    @Setter
    private String usuario;

    public String getEmail() {
        return email.toLowerCase();
    }

    @Column(name="e-mail")
    @Getter
    @Setter
    private String email;
}
