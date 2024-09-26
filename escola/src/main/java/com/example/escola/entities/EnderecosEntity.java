package com.example.escola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "enderecos")
public class EnderecosEntity {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "id")
private Long id;


@Column(name = "rua")
private String rua;

@Column(name = "numero")
private String numero;

@Column(name = "cidade")
private String cidade;


@OneToOne
@JoinColumn(name="professores")
private ProfessorEntity professores;


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getRua() {
    return rua;
}


public void setRua(String rua) {
    this.rua = rua;
}


public String getNumero() {
    return numero;
}


public void setNumero(String numero) {
    this.numero = numero;
}


public String getCidade() {
    return cidade;
}


public void setCidade(String cidade) {
    this.cidade = cidade;
}


public ProfessorEntity getProfessores() {
    return professores;
}


public void setProfessores(ProfessorEntity professores) {
    this.professores = professores;
}







}
