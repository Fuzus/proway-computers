package br.com.fuzus.prowaycomputersapi.service;

import br.com.fuzus.prowaycomputersapi.model.Produto;
import br.com.fuzus.prowaycomputersapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    public Produto getProdutoById(Integer id) {
        return produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encotrado"));
    }
}
