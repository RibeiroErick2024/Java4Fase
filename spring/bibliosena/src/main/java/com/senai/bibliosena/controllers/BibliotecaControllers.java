package com.senai.bibliosena.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class BibliotecaControllers {
    
    @GetMapping("/user")
    public Carro findCarro() {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno("2022");
        return carro;
    }

    @PostMapping("/carro")
    public String createBiblioteca(@RequestBody Carro carro) {
        
        return carro.getModelo() +"  " + carro.getMarca() + "  " + carro.getAno() + " " + "Criado com sucesso!";
        
    }

   
    public static class Carro {
        private String modelo;
        private String marca;
        private String ano;


        public String getAno(){
            return ano;
        }
        public void setAno(String ano){
            this.ano = ano;
        }

      
        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }
    }
}
