import { Component, OnInit } from '@angular/core';
import {ProductComponent} from '../product/product.component';

@Component({
  selector: 'app-grid-list',
  templateUrl: './grid-list.component.html',
  styleUrls: ['./grid-list.component.css']
})
export class GridListComponent implements OnInit {

  value: string;
  products: any;
  productComponent: ProductComponent;
  actual: boolean;

  constructor() {
   }

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
    this.actual = true;
  }

  showBike(): void {
    this.value = 'Kategoria rowery';
  }

  showFashion(): void {
    this.value = 'Kategoria moda';

  }
}
