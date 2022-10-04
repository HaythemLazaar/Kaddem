package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "DetailEquipe")
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailEquipe")
    private long idDetailEquipe;
    @Column(name = "salle")
    private long salle;
    @Column(name = "thematique")
    private String thematique;

    public long getSalle() {
        return salle;
    }
    public void setSalle(long salle) {
        this.salle = salle;
    }
    public String getThematique() {
        return thematique;
    }
    public void setThematique(String thematique) {
        this.thematique = thematique;
    }

    @OneToOne(mappedBy = "detailEquipe")
    private Equipe equipe;
}
