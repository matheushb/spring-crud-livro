package com.cesumar.livraria.modules.livro.mappers;

import com.cesumar.livraria.modules.livro.dtos.CreateLivroDto;
import com.cesumar.livraria.modules.livro.dtos.UpdateLivroDto;
import com.cesumar.livraria.modules.livro.entities.Livro;

public class LivroMapper {

    public Livro toEntity(CreateLivroDto createLivroDto) {
        Livro livro = new Livro();

        livro.setStatusLivro(createLivroDto.getStatusLivro());
        livro.setNome(createLivroDto.getNome());
        livro.setAutor(createLivroDto.getAutor());

        return livro;
    }

    public CreateLivroDto toDto(Livro livro) {
        CreateLivroDto createLivroDto = new CreateLivroDto();

        createLivroDto.setStatusLivro(livro.getStatusLivro());
        createLivroDto.setAutor(livro.getAutor());
        createLivroDto.setNome(livro.getNome());

        return createLivroDto;
    }

    public Livro updateEntity(Livro livro, UpdateLivroDto updateLivroDto) {
        if (updateLivroDto.getNome() != null) {
            livro.setNome(updateLivroDto.getNome());
        }
        if (updateLivroDto.getAutor() != null) {
            livro.setAutor(updateLivroDto.getAutor());
        }
        if (updateLivroDto.getStatusLivro() != null) {
            livro.setStatusLivro(updateLivroDto.getStatusLivro());
        }
        return livro;
    }
}
