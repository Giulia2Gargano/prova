import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { MovimentoBancario } from './MovimentoBancario';
import { MovimentoBancarioDto } from './movimentoBancarioDto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  movimentoBancario = new MovimentoBancario();
  array: MovimentoBancario[] = [];
  tabella = false;

  constructor(private http: HttpClient) { }

  //aggiunge movimento bancario
  Aggiungi() {
    //creo un dto movimento bancario
    let dto = new MovimentoBancarioDto();
    //set della proprietà movimento
    dto.movimento = this.movimentoBancario;
    //richiesta tipo post al server
    this.http.post<MovimentoBancarioDto>("http://localhost:8080/calcola-dollari", dto).subscribe(d => { 
      //set di movimento bancario come l'oggetto che mi arriva in risposta dal server
      this.movimentoBancario = d.movimento;
      //inserisco il movimento bancario nell'array
      this.array.push(this.movimentoBancario);
      //pulisco movimento bancario
      this.movimentoBancario = new MovimentoBancario();
    })
  }

  Elimina(i : number) {
    //elimina dall'array
    this.array.splice(i, 1);
  }



}
