import { Component, OnInit } from '@angular/core';
import {CategoryElectronicComponent} from '../category-electronic/category-electronic.component';

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css']
})
export class ProductCardComponent implements OnInit {

  description: string;
  price: number;
  currency: string;
  title: string;
  category: string;

  constructor() {
   }

  ngOnInit(): void {
    this.price = 199.99;
    this.currency = ' zł';
    this.title = 'Laptop Dell';
    this.category = 'Elektronika';
  }

  public getDescriptionDell(): void {
    this.description =  'Ekran 15.6", 1920 x 1080px, 60Hz Procesor Intel Core i5-10300H Wielkość pamięci RAM[GB] 8 Dysk 512 GB SSD Karta graficzna NVIDIA GeForce GTX 1650 TI System operacyjny Windows 10 Home';
  }
}
