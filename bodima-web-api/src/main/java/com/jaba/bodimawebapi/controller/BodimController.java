package com.jaba.bodimawebapi.controller;


import com.jaba.bodimawebapi.entity.Bodima;
import com.jaba.bodimawebapi.repository.BodimaRepository;
import com.jaba.bodimawebapi.service.HibernateSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class BodimController {

    @Autowired
    private HibernateSearchService searchservice;

    @Autowired
    BodimaRepository bodimaRepository;

    @GetMapping("/bodim")
    public List<Bodima> search(@RequestParam(value = "search",required = false)String q, Model model){
        List<Bodima> bodimaResults = null;

        try {
            bodimaResults = searchservice.fuzzySearch(q);
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("search",bodimaResults);
        return bodimaResults;
    }
//    public List<Bodima> getAllNotes() {
//        return bodimaRepository.findAll();
//    }

    @GetMapping("/bodim/{id}")
    public ResponseEntity<Bodima> getNoteById(@PathVariable(value = "id") Long bodimId) {
        Bodima bodima = bodimaRepository.findOne(bodimId);
        if(bodima == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(bodima);
    }

    @PostMapping("/bodim")
    public Bodima createNote(@Valid @RequestBody Bodima bodima) {
        return bodimaRepository.save(bodima);
    }

    @PutMapping("/bodim/{id}")
    public ResponseEntity<Bodima> updateNote(@PathVariable(value = "id") Long bodimId,
                                           @Valid @RequestBody Bodima bodimaDetails) {
        Bodima bodima = bodimaRepository.findOne(bodimId);
        if(bodima == null) {
            return ResponseEntity.notFound().build();
        }
        bodima.setAddress(bodimaDetails.getAddress());
        bodima.setGender(bodimaDetails.getGender());
        bodima.setLocation(bodimaDetails.getLocation());

        Bodima updatedBodima = bodimaRepository.save(bodima);
        return ResponseEntity.ok(updatedBodima);
    }

    @DeleteMapping("/bodim/{id}")
    public ResponseEntity<Bodima> deleteNote(@PathVariable(value = "id") Long bodimId) {
        Bodima bodima = bodimaRepository.findOne(bodimId);
        if(bodima == null) {
            return ResponseEntity.notFound().build();
        }

        bodimaRepository.delete(bodima);
        return ResponseEntity.ok().build();
    }
}
