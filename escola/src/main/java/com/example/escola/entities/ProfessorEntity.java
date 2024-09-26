package com.example.escola.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "professores")

public class ProfessorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    

    @Column(name= "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecosEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecosEntity endereco) {
        this.endereco = endereco;
    }

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private EnderecosEntity endereco;

    
    

}