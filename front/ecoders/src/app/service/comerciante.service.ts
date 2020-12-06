import { Injectable } from '@angular/core';
import { Comerciante } from '../model/Comerciante';

@Injectable({
  providedIn: 'root'
})
export class ComercianteService {

  
  constructor(private http: HttpClient, private router: Router) {

   }


  cadastrarComerciante(comerciante: Comerciante)
  {
      return this.http.post('https://localhost:8080/comerciante/cadastrar',comerciante);
  }

  encontrarTodos()
  {
    return this.http.get('https://localhost:8080/comerciante/all');
  }

  encontrarPorId(id: number)
  {
    return this.http.get('https://localhost:8080/comerciante/id/{{id}}');
  }

  encontrarPorRegiao(regiao: string)
  {
    return this.http.get('https://localhost:8080/comerciante/regiao/{{regiao}}');
  }


}
