package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Etudiant;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
    Etudiant getEtudiantById(Long id);
    Etudiant getEtudiantByPrenomE(String p);
    void assignEtudiantToDepartement(Long idEtudiant, Long idDepart);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Long idDepartement);
}
