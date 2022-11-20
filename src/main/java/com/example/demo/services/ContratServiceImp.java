package com.example.demo.services;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.entities.Contrat;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Specialite;
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


    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        // Recuperation des contrats non archives + entre les deux dates 
        List<Contrat> contratsNonArchives = contratRepository.findAll().stream()
            .filter(c -> c.isArchive() == false 
                && (!startDate.after(c.getDateFinContrat()) && !endDate.before(c.getDateDebutContrat())))
            .collect(Collectors.toList());
        // Parcour la liste des contrats
        Double sumChiffreAffaire = contratsNonArchives.stream().mapToDouble(c -> {
                Double chiffreAffaire = 0d;
                Date start = startDate.after(c.getDateDebutContrat()) ? startDate: c.getDateDebutContrat();
                // Iteration sur l'intersection des deux intrvalles de temps
                while(start.before(endDate.before(c.getDateFinContrat()) ? endDate: c.getDateFinContrat())){
                        // Incrementer la date par 1 mois
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(start);
                        cal.add(Calendar.MONTH, 1);
                        start = cal.getTime();
                        //System.out.println(start);
                        if (c.getSpecialite() == Specialite.IA ) chiffreAffaire += 300;
                        else if (c.getSpecialite() == Specialite.RESEAUX ) chiffreAffaire += 350;
                        else if (c.getSpecialite() == Specialite.CLOUD ) chiffreAffaire += 400;
                        else if (c.getSpecialite() == Specialite.SECURITE ) chiffreAffaire += 450;
                    }
                    return chiffreAffaire; })
            .sum();

        return sumChiffreAffaire.floatValue();
    }

    @Override
    public Integer nbContratsValides(Date startDate, Date endDate) {
        return contratRepository.findAll().stream()
            .filter(
                c -> c.isArchive() == false 
                && 
                (!startDate.after(c.getDateFinContrat()) && !endDate.before(c.getDateDebutContrat())))
            .collect(Collectors.toList()).size();
    }
    
}
