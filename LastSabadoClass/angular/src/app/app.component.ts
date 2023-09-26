import { ProdutoService } from './service/produto.service';
import { Component, OnInit } from '@angular/core';
import { Produto } from './model/produto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  ngOnInit(): void {
    this.buscar();
  }

  produtos: Produto[] = [];

  constructor(private service: ProdutoService) {

  }

  public buscar() {
    this.service.listar().subscribe(res => {
      this.produtos = res;
    });
  }
}
