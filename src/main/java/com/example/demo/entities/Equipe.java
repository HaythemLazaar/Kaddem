package com.example.demo.entities;

import java.util.Set;
import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "Equipe")
@Getter
@Setter
@EqualsAndHashCode
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private long idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
