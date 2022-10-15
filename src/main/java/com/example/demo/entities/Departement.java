package com.example.demo.entities;

import java.util.Set;
import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "Departement")
@Getter
@Setter
@EqualsAndHashCode
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart")
    private long idDepart;
    private String nomDepart;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departement")
    private Set<Etudiant> etudiants;

}
