package com.example.demo.entities;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@EqualsAndHashCode
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrat")
    private long idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;

    @ManyToOne
    @JsonIgnore
    Etudiant etudiant;
}
