import { Component, OnInit } from '@angular/core';
import { Categoria } from '../model/Categoria';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  categoria : Categoria = new Categoria();
  constructor() { }

  ngOnInit(){
  }

}
