package com.example.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.escola.entities.TurmasEntity;
import com.example.escola.services.EscolaService;

@RestController
@RequestMapping("/turmas")  
public class EscolaController {

    @Autowired
    private EscolaService escolaService;

    @GetMapping
    public List<TurmasEntity> getAllTurmas() {
        return escolaService.getAllTurmas();
    }

    @GetMapping("/{id}")  
        public ResponseEntity<TurmasEntity> getTurmaById(@PathVariable Long id) {
        Optional<TurmasEntity> turma = escolaService.getTurmaById(id);
        return turma.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TurmasEntity createTurma(@RequestBody TurmasEntity turma) {
        return escolaService.createTurma(turma);
    }
}
