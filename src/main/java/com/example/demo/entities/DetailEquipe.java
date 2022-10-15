package com.example.demo.entities;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "DetailEquipe")
@Getter
@Setter
@EqualsAndHashCode
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailEquipe")
    private long idDetailEquipe;
    @Column(name = "salle")
    private long salle;
    @Column(name = "thematique")
    private String thematique;

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
