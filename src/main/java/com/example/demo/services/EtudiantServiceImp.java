package com.example.demo.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contrat;
import com.example.demo.entities.Departement;
import com.example.demo.entities.Equipe;
import com.example.demo.entities.Etudiant;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.EquipeRepository;
import com.example.demo.repository.EtudiantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EtudiantServiceImp implements EtudiantService{

    EtudiantRepository etudiantRepository;
    DepartementRepository departementRepository;
    EquipeRepository equipeRepository;
    ContratRepository contratRepository;

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long id) {       
        etudiantRepository.deleteById(id); 
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public Etudiant getEtudiantByPrenomE(String p){
        return etudiantRepository.findEtudiantByPrenomE(p);
    }

    @Override
    public void assignEtudiantToDepartement(Long idEtudiant, Long idDepart) {
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).orElse(null);
        Departement depart = departementRepository.findById(idDepart).orElse(null);
        etudiant.setDepartement(depart);
        etudiantRepository.save(etudiant);        
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Long idContrat, Long idEquipe) {
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Set<Equipe> equipes = new HashSet<Equipe>();
        equipes.add(equipe);
        //Set<Etudiant> etudiants = new HashSet<Etudiant>();
        //etudiants.add(e);
        //equipe.setEtudiants(etudiants);
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Set<Contrat> contrats = new HashSet<Contrat>();
        contrats.add(contrat);
        //contrat.setEtudiant(e);
        e.setContrats(contrats);
        e.setEquipes(equipes);
        return etudiantRepository.save(e);
    }
    
}
