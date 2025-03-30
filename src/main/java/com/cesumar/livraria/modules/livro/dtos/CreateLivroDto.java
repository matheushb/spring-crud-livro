package com.cesumar.livraria.modules.livro.dtos;

import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateLivroDto {


    private Long id;

    @NotBlank(message = "Nome é obrigatorio")
    @Size(min = 2, message = "Nome deve conter ao menos 2 caracteres")
    private String nome;

    @NotBlank(message = "Autor é obrigatorio")
    @Size(min = 2, message = "Autor deve conter ao menos 2 caracteres")
    private String autor;

    @NotBlank(message = "StatusLivro deve ser  EM_EMPRESTIMO, DISPONIVEL, RESERVADO")
    private StatusLivro statusLivro;
    public CreateLivroDto(Long id, String nome, String autor, StatusLivro statusLivro) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.statusLivro = statusLivro;
    }

    public CreateLivroDto() {}

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
