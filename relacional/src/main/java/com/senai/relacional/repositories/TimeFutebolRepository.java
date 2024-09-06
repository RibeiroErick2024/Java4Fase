package com.senai.relacional.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.relacional.entities.TimeFutebol;

public interface TimeFutebolRepository extends JpaRepository<TimeFutebol, Long> {
    
}



