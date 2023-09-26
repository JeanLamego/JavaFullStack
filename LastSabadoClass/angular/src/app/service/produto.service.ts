import { HttpClient } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Produto } from '../model/produto';



@Injectable()
export class ProdutoService{

constructor(private http : HttpClient){
}

public listar(){
    return this.http.get<Produto[]>("http://localhost:8080/backEnd/produto");
}

}