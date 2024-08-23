package com.senai.bibliosena.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class Users {

    @GetMapping("/user")
    public Usuario findUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setEmail("joao@example.com");
        usuario.setIdade(30);
        return usuario;
    }

    @PostMapping("/user")
    public String createUsuario(@RequestBody Usuario usuario) {
        return "Usuário " + usuario.getNome() + " com email " + usuario.getEmail() + " criado com sucesso!";
    }

    // Classe Usuario para ser retornada e recebida como JSON
    public static class Usuario {
        private String nome;
        private String email;
        private int idade;

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
}
