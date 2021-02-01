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

  showToys(): void {
    this.value = 'Kategoria zabawki';
  }

  showProperty(): void {
    this.value = 'Kategoria nieruchomości';
  }

  showAutomotive(): void {
    this.value = 'Kategoria motoryzacja';
  }

  showElectronic(): void {
    this.value = 'Kategoria elektronika';

  }

  showBike(): void {
    this.value = 'Kategoria rowery';

  }

  showFashion(): void {
    this.value = 'Kategoria moda';

  }
}
