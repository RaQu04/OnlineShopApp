import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grid-list',
  templateUrl: './grid-list.component.html',
  styleUrls: ['./grid-list.component.css']
})
export class GridListComponent implements OnInit {

  value: string;

  constructor() { }

  ngOnInit(): void {
  }

  pokazZabawki(): void {
    this.value = 'Kategoria zabawki';
  }

  pokazNieruchomosci(): void {
    this.value = 'Kategoria nieruchomości';
  }

  pokazMotoryzacja(): void {
    this.value = 'Kategoria motoryzacja';
  }

  pokazEletronika(): void {
    this.value = 'Kategoria elektronika';

  }

  pokazRowery(): void {
    this.value = 'Kategoria rowery';

  }

  pokazModa(): void {
    this.value = 'Kategoria moda';

  }
}
