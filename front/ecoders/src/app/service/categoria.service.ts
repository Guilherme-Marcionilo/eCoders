import { Injectable } from '@angular/core';
import { Categoria } from '../model/Categoria';

@Injectable({
  providedIn: 'root'
})
export class CategoriaService {

  public categoria: Categoria;
  constructor(private http: HttpClient, private router: Router) {

   }


  cadastrarCategoria(categoria:Categoria)
  {
      return this.http.post('https://localhost:8080/categoria/cadastrar',categoria);
  }
}
