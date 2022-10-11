package com.example.demo.entities;


import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv")
    private long idUniv;
    private String nomUniv;
    // Getters & Setters
    public String getNomUniv() {
        return nomUniv;
    }
    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;
}
