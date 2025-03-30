package com.cesumar.livraria.modules.livro.entities;

import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String autor;

    @Enumerated(EnumType.STRING)
    private StatusLivro statusLivro;

    public Livro(Long id, String nome, String autor, StatusLivro statusLivro) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.statusLivro = statusLivro;
    }

    public Livro() {}

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }
}
