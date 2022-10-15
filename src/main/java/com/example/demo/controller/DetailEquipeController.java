package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/DetailEquipe")
    List<DetailEquipe> DetailEquipes(){
        return DetailEquipeService.retrieveAllDetailEquipes();
    }

    @PostMapping("/DetailEquipe")
    DetailEquipe DetailEquipe(@RequestBody DetailEquipe DetailEquipe){
        return DetailEquipeService.updateDetailEquipe(DetailEquipe);
    }
    
}
