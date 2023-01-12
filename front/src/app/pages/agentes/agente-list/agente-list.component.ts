import { Component } from '@angular/core';
import { AgenteService } from '../shared/agente-service';

@Component({
  selector: 'app-agente-list',
  templateUrl: './agente-list.component.html',
  styleUrls: ['./agente-list.component.css']
})
export class AgenteListComponent {

 public agentes: any;
 public regiao:any;
 displayedColumns: string[] = ['codigo',  'data'];

  constructor(private service: AgenteService) { }



  buscarPorRegiao(regiao:any) {
    this.agentes = [];
    this.service.buscarPorRegiao(regiao)
      .then(agentes => {
        this.agentes = agentes;
        console.log(agentes)
      }).catch(erro => {
        alert(erro)
      });
  }

}
