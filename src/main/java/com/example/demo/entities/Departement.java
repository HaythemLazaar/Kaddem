package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")
    private long idDepart;
    private String nomDepart;
    // Getters & Setters
    public String getNomDepart() {
        return nomDepart;
    }
    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
