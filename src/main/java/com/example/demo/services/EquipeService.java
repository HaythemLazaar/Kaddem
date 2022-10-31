package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Equipe;

public interface EquipeService {
    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail
    Equipe updateEquipe (Equipe e);
    Equipe retrieveEquipe (Long idEquipe);
    List<Equipe> getEquipeByEtudiantIdEtudiant(Long idEtudiant);
}
