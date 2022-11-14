package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Universite;
import com.example.demo.services.UniversiteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UniversiteController {
    
    
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

    @PutMapping("/universite/assign/{idUniv}/{idDepart}")
    void assignUniversiteToDepartement(@PathVariable("idUniv") Long idUniv, @PathVariable("idDepart") Long idDepart){
        UniversiteService.assignUniversiteToDepartement(idUniv, idDepart);
    }
    
}
