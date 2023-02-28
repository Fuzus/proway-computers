package br.com.fuzus.prowaycomputersapi.repository;

import br.com.fuzus.prowaycomputersapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
