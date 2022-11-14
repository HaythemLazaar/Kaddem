package com.example.demo.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Contrat;
import com.example.demo.entities.Etudiant;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.EtudiantRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContratServiceImp implements ContratService{

    ContratRepository contratRepository;
    EtudiantRepository etudiantRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);        
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        Etudiant etudiant = etudiantRepository.findEtudiantByPrenomE(prenomE);
        Set<Contrat> contratsEtudiant = etudiant.getContrats();
        if(contratsEtudiant.size() < 5) ce.setEtudiant(etudiant);
        return contratRepository.save(ce);
    }
    
}
