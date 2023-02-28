package br.com.fuzus.prowaycomputersapi.model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private BigDecimal preco;
    private String descricaoPreco;
    private String imagem;
    private Integer quantidadeEstoque;

    public Produto(){}

    public Produto(Integer id, String descricao, BigDecimal preco, String descricaoPreco, String imagem, Integer quantidadeEstoque) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.descricaoPreco = descricaoPreco;
        this.imagem = imagem;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDescricaoPreco() {
        return descricaoPreco;
    }

    public void setDescricaoPreco(String descricaoPreco) {
        this.descricaoPreco = descricaoPreco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
