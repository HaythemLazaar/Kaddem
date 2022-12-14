package com.example.demo.entities;

import java.util.Set;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "Etudiant")
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant")
    private long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;    

    @ManyToOne
    Departement departement;
}
