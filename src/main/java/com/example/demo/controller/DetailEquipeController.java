package com.example.demo.controller;

import java.util.List;

import javax.xml.soap.Detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DetailEquipe;
import com.example.demo.services.DetailEquipeService;

@RestController
@RequestMapping("/api")
public class DetailEquipeController {

    @Autowired
    DetailEquipeService DetailEquipeService;

    @GetMapping("/detailEquipe")
    List<DetailEquipe> getAllDetailEquipes(){
        return DetailEquipeService.retrieveAllDetailEquipes();
    }

    @GetMapping("/detailEquipe/id/{idDetailEquipe}")
    DetailEquipe getDetailEquipe(@PathVariable Long idDetailEquipe){
        return DetailEquipeService.retrieveDetailEquipe(idDetailEquipe);
    }

    @PostMapping("/detailEquipe")
    DetailEquipe addDetailEquipe(@RequestBody DetailEquipe DetailEquipe){
        return DetailEquipeService.addDetailEquipe(DetailEquipe);
    }

    @PutMapping("/detailEquipe")
    DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe DetailEquipe){
        return DetailEquipeService.updateDetailEquipe(DetailEquipe);
    }
    
    @DeleteMapping("/detailEquipe/{idDetailEquipe}")
    void deleteDetailEquipe(@PathVariable Long idDetailEquipe){
        DetailEquipeService.removeDetailEquipe(idDetailEquipe);
    }

    @GetMapping("/detailEquipe/thematique/{thematique}")
    List<DetailEquipe> getDetailEquipeByThematique(@PathVariable String thematique){
        return DetailEquipeService.getDetailEquipeByThematique(thematique);
    }
    
}
