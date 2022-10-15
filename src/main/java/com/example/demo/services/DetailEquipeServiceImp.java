package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.DetailEquipe;
import com.example.demo.repository.DetailEquipeRepository;


@Service
public class DetailEquipeServiceImp implements DetailEquipeService{

    @Autowired
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
    
}
