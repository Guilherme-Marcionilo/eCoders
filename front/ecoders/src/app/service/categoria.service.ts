import { Injectable } from '@angular/core';
import { Categoria } from '../model/Categoria';

@Injectable({
  providedIn: 'root'
})
export class CategoriaService {

  
  constructor(private http: HttpClient, private router: Router) {

   }


  cadastrarCategoria(categoria:Categoria)
  {
      return this.http.post('https://localhost:8080/categoria/cadastrar',categoria);
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
