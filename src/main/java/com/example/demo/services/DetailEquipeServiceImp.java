package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.DetailEquipe;
import com.example.demo.repository.DetailEquipeRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class DetailEquipeServiceImp implements DetailEquipeService{

    DetailEquipeRepository detailEquipeRepository;

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipes() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe u) {
        return detailEquipeRepository.save(u);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe u) {
        return detailEquipeRepository.save(u);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Long idDetailEquipe) {
        return detailEquipeRepository.findById(idDetailEquipe).orElse(null);
    }

    @Override
    public void removeDetailEquipe(Long idDetailEquipe){
        detailEquipeRepository.deleteById(idDetailEquipe);
    }
    
    @Override
    public List<DetailEquipe> getDetailEquipeByThematique(String Thematique){
        return detailEquipeRepository.findByThematiqueLike(Thematique);
    }
}
