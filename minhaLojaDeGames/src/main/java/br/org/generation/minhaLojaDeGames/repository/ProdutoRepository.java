package br.org.generation.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.minhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
