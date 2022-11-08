package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Universite;
import com.example.demo.services.UniversiteService;

@RestController
@RequestMapping("/api")
public class UniversiteController {
    
    @Autowired
    UniversiteService UniversiteService;

    @GetMapping("/universite")
    List<Universite> getAllUniversites(){
        return UniversiteService.retrieveAllUniversites();
    }

    @GetMapping("/universite/{idUniversite}")
    Universite getUniversite(@PathVariable Long idUniversite){
        return UniversiteService.retrieveUniversite(idUniversite);
    }

    @PostMapping("/universite")
    Universite addUniversite(@RequestBody Universite Universite){
        return UniversiteService.addUniversite(Universite);
    }

    @PutMapping("/universite")
    Universite updateUniversite(@RequestBody Universite Universite){
        return UniversiteService.updateUniversite(Universite);
    }

    @PutMapping("/universite/{idUniv}/{idDepart}")
    void assignUniversiteToDepartement(@PathVariable Long idUniv, @PathVariable Long idDepart){
        UniversiteService.assignUniversiteToDepartement(idUniv, idDepart);
    }
    
}
