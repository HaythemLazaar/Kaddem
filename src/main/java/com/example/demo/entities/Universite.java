package com.example.demo.entities;


import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity
@Table(name = "Universite")
@Getter
@Setter
@EqualsAndHashCode
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv")
    private long idUniv;
    private String nomUniv;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Departement> departements;
}
