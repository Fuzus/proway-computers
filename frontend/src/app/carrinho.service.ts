import { Injectable } from '@angular/core';
import { IProduto, IProdutoCarrinho } from './produtos';

@Injectable({
  providedIn: 'root'
})

export class CarrinhoService {
  itens: IProdutoCarrinho[] = [];


  constructor() { }

  obtemCarrinho() {
    this.itens = JSON.parse(localStorage.getItem("carrinho") || "[]");
    return this.itens;
  }

  adicionarAoCarrinho(produto: IProdutoCarrinho) {
    const test = this.itens.find(x => x.id == produto.id);
    
    test ? test.quantidade += produto.quantidade : this.itens.push(produto);

    localStorage.setItem("carrinho", JSON.stringify(this.itens));
  }

  limparCarrinho() {
    this.itens = [];
    localStorage.clear();
  }

  removerProdutoCarrinho(produtoId: Number) {
    this.itens = this.itens.filter(x => x.id !== produtoId);
    localStorage.setItem("carrinho", JSON.stringify(this.itens));
    return this.itens;
  }
}
