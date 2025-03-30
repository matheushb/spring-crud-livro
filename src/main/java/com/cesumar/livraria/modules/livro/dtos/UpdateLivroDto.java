package com.cesumar.livraria.modules.livro.dtos;

import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UpdateLivroDto {

    @Size(min = 2, message = "Nome deve conter ao menos 2 caracteres")
    private String nome;

    @Size(min = 2, message = "Autor deve conter ao menos 2 caracteres")
    private String autor;

    private StatusLivro statusLivro;


    public UpdateLivroDto(String nome, String autor, StatusLivro statusLivro) {
        this.nome = nome;
        this.autor = autor;
        this.statusLivro = statusLivro;
    }

    public UpdateLivroDto() {}

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
