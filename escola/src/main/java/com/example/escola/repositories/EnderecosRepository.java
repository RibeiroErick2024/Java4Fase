package com.example.escola.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.escola.entities.EnderecosEntity;

@Repository
public interface EnderecosRepository extends JpaRepository<EnderecosEntity, Long> {
    
}
