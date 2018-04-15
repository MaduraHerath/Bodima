package com.jaba.bodimawebapi.controller;


import com.jaba.bodimawebapi.entity.Bodima;
import com.jaba.bodimawebapi.repository.BodimaRepository;
import com.jaba.bodimawebapi.service.HibernateSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class BodimController {

    @Autowired
    private HibernateSearchService searchservice;

    @Autowired
    BodimaRepository bodimaRepository;

    private List<Bodima> filteredBodims = new ArrayList<Bodima>();

    @GetMapping("/bodim")
    public List<Bodima> search(@RequestParam(value = "search",required = false)String q, Model model){
        List<Bodima> bodimaResults = null;

        try {
            bodimaResults = searchservice.fuzzySearch(q);
            filteredBodims= bodimaResults;
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

    @PostMapping(value = "filteredBodima")
    public List<Bodima> getFiltered(@RequestBody Bodima bodima){
       List<Bodima> anygenderBodims =  filteredBodims.stream().filter(e -> e.getStatus() == true && (e.getPrice() <= bodima.getPrice() && e.getRoomCount() >= bodima.getRoomCount() || e.getGender() == bodima.getGender()))
                .collect(Collectors.toList());

        return anygenderBodims.stream().filter(q->q.getGender().equals(bodima.getGender().toString())) .collect(Collectors.toList());

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
