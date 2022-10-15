package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/Universite")
    List<Universite> Universites(){
        return UniversiteService.retrieveAllUniversites();
    }

    @PostMapping("/Universite")
    Universite Universite(@RequestBody Universite Universite){
        return UniversiteService.updateUniversite(Universite);
    }
    
}
