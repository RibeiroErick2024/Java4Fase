package com.example.escola.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity(name = "turmas")
public class TurmasEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "nome")
    private String name;


    @Column(name = "ano")
    private String ano;




    @OneToMany(mappedBy = "turmas")
    private List<ProfessorEntity> professor;




    public Long getId() {
        return id;
    }




    public void setId(Long id) {
        this.id = id;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public String getAno() {
        return ano;
    }




    public void setAno(String ano) {
        this.ano = ano;
    }




    public List<ProfessorEntity> getProfessor() {
        return professor;
    }




    public void setProfessor(List<ProfessorEntity> professor) {
        this.professor = professor;
    }
    
 






}
