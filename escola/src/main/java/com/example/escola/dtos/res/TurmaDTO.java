package com.example.escola.dtos.res;

public class TurmaDTO {

    private Long id;              
    private String nome;          
    private Integer ano;          
    private Long professorId;     

    
    public TurmaDTO() {}

    
    public TurmaDTO(Long id, String nome, Integer ano, Long professorId) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.professorId = professorId;
    }

   
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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "TurmaDTO{"+"id=" + id +", nome='" + nome + '\'' +", ano=" + ano +", professorId=" + professorId +'}';
    }
}
