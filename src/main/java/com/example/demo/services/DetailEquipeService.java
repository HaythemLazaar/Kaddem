package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.DetailEquipe;

public interface DetailEquipeService {
    List<DetailEquipe> retrieveAllDetailEquipes();
    DetailEquipe addDetailEquipe (DetailEquipe u);
    DetailEquipe updateDetailEquipe (DetailEquipe u);
    DetailEquipe retrieveDetailEquipe (Long idDetailEquipe);
    void removeDetailEquipe (Long idDetailEquipe);
}
