import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { IProduto } from './produtos';

@Injectable({
  providedIn: 'root'
})
export class ProdutosService {

  produtos: IProduto[] = [];

  url = "http://localhost:8080/produtos"

  constructor(private http: HttpClient) { }

  getAll(): Observable<IProduto[]> {
    return this.http.get<IProduto[]>(this.url).pipe(
      map((res) => {
        this.produtos = res;
        return this.produtos;
      })
    );
  }

  getOne(produtoId: number) {
    return this.http.get<IProduto>(this.url+`/${produtoId}`).pipe(
      map((res) => {
        return res;
      })
    );
  }
}
