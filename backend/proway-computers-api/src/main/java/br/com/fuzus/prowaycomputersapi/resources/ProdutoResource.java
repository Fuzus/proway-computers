package br.com.fuzus.prowaycomputersapi.resources;

import br.com.fuzus.prowaycomputersapi.model.Produto;
import br.com.fuzus.prowaycomputersapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>>getAll() {
        List<Produto> list = service.getAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto>getById(@PathVariable Integer id) {
        Produto produto = service.getProdutoById(id);
        return ResponseEntity.ok(produto);
    }

}
