package com.example.demo.services;

import java.util.Date;
import java.util.List;
import com.example.demo.entities.Contrat;

public interface ContratService {
    List<Contrat> retrieveAllContrats();
    Contrat updateContrat (Contrat ce);
    Contrat addContrat (Contrat ce);
    Contrat retrieveContrat (Long idContrat);
    void removeContrat(Long idContrat);
    Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);
    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
    Integer nbContratsValides(Date startDate, Date endDate);
}
