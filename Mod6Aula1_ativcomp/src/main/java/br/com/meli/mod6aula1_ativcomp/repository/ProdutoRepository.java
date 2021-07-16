package br.com.meli.mod6aula1_ativcomp.repository;

import br.com.meli.mod6aula1_ativcomp.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
