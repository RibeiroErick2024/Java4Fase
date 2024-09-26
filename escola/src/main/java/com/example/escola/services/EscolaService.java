package com.example.escola.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.escola.entities.TurmasEntity;
import com.example.escola.repositories.TurmasRepository;

@Service
public class EscolaService {

    @Autowired
    private TurmasRepository turmasRepository;

    public List<TurmasEntity> getAllTurmas() {
        return turmasRepository.findAll();
    }

    public Optional<TurmasEntity> getTurmaById(Long id) {
        return turmasRepository.findById(id);
    }

    public TurmasEntity createTurma(TurmasEntity turma) {
        return turmasRepository.save(turma);
    }
}
