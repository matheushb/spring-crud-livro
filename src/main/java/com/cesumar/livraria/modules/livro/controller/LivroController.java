package com.cesumar.livraria.modules.livro.controller;

import com.cesumar.livraria.modules.livro.dtos.CreateLivroDto;
import com.cesumar.livraria.modules.livro.dtos.UpdateLivroDto;
import com.cesumar.livraria.modules.livro.entities.Livro;
import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import com.cesumar.livraria.modules.livro.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/livro")
@RestController
public class LivroController {

    @Autowired
    LivroService livroService;

    @PostMapping()
    public ResponseEntity<Livro> create(@RequestBody CreateLivroDto createLivroDto) {
        Livro livro = this.livroService.create(createLivroDto);
        return ResponseEntity.status(201).body(livro);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> findAll(@RequestParam(value = "statusLivro", required = false) StatusLivro statusLivro) {
        List<Livro> livros = this.livroService.findAll(Optional.ofNullable(statusLivro));
        return ResponseEntity.ok(livros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> findOne(@PathVariable Long id) {
        Optional<Livro> livro = this.livroService.findOne(id);
        return ResponseEntity.ok(livro);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Livro> update(@PathVariable Long id, @RequestBody UpdateLivroDto updateLivroDto) {
        Livro livro = this.livroService.update(id, updateLivroDto);
        return ResponseEntity.ok(livro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Livro> delete(@PathVariable Long id) {
        Livro livro = this.livroService.delete(id);
        return ResponseEntity.ok(livro);
    }
}
