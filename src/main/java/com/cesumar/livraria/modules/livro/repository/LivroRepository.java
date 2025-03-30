package com.cesumar.livraria.modules.livro.repository;

import com.cesumar.livraria.modules.livro.entities.Livro;
import com.cesumar.livraria.modules.livro.entities.enums.StatusLivro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByStatusLivro(StatusLivro statusLivro);
}
