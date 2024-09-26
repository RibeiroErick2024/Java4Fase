package com.example.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escola.entities.TurmasEntity;

@Repository
public interface TurmasRepository extends JpaRepository<TurmasEntity, Long> {
    
}