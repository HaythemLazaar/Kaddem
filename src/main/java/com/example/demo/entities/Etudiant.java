package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    public String getPrenomE() {
        return prenomE;
    }
    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }
    public String getNomE() {
        return nomE;
    }
    public void setNomE(String nomE) {
        this.nomE = nomE;
    }
}
