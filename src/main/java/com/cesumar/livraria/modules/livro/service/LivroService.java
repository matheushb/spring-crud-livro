package com.cesumar.livraria.modules.livro.service;

import com.cesumar.livraria.modules.livro.dtos.CreateLivroDto;
import com.cesumar.livraria.modules.livro.dtos.UpdateLivroDto;
import com.cesumar.livraria.modules.livro.entities.Livro;
import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import com.cesumar.livraria.modules.livro.mappers.LivroMapper;
import com.cesumar.livraria.modules.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    private LivroMapper livroMapper = new LivroMapper();

    public Livro create(CreateLivroDto createLivroDto) {
        Livro livro = livroMapper.toEntity(createLivroDto);
        return livroRepository.save(livro);
    }

    public List<Livro> findAll(Optional<StatusLivro> statusLivro) {
        if (statusLivro.isPresent()) {
            return livroRepository.findByStatusLivro(statusLivro.get());
        }
        return livroRepository.findAll();
    }

    public Optional<Livro> findOne(Long id) {
        return livroRepository.findById(id);
    }

    public Livro update(Long id, UpdateLivroDto updateLivroDto) {
        Optional<Livro> livroOpt = livroRepository.findById(id);
        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            livro = livroMapper.updateEntity(livro, updateLivroDto);
            return livroRepository.save(livro);
        }
        return null;
    }

    public Livro delete(Long id) {
        Optional<Livro> livroOpt = livroRepository.findById(id);
        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            livroRepository.delete(livro);
            return livro;
        }
        return null;
    }
}
