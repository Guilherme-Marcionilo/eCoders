import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Categoria } from '../model/Categoria';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CategoriaService {

  
  constructor(private http: HttpClient, private router: Router) {

   }


  cadastrarCategoria(categoria:Categoria): Observable<Categoria>
  {
      return this.http.post<Categoria>('https://localhost:8080/categoria/cadastrar',categoria);
  }

  encontrarTodos()
  {
    return this.http.get('https://localhost:8080/categoria/all');
  }

  encontrarPorId(id: number)
  {
    return this.http.get('https://localhost:8080/categoria/id/{{id}}');
  }

}
