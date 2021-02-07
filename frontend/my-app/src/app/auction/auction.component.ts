import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-auction',
  templateUrl: './auction.component.html',
  styleUrls: ['./auction.component.css']
})
export class AuctionComponent implements OnInit {
  title: string;
  category: string;
  description: string;
  priceBuyNow: number;
  price: number;
  currency: string;
  endDate: string;

  constructor() { }

  ngOnInit(): void {
    this.price = 199.99;
    this.currency = ' zł';
    this.title = 'Laptop Dell';
    this.category = 'Elektronika';
    this.priceBuyNow = 299.99;
    this.endDate = '14.02.2020';
  }

  getDescriptionDell(): void {
    this.description =  'Ekran 15.6", 1920 x 1080px, 60Hz Procesor Intel Core i5-10300H Wielkość pamięci RAM[GB] 8 Dysk 512 GB SSD Karta graficzna NVIDIA GeForce GTX 1650 TI System operacyjny Windows 10 Home';
  }

  // tslint:disable-next-line:typedef
  bidPlusOne() {
    this.price = this.price + 1;
  }

  // tslint:disable-next-line:typedef
  bidPlusMore() {
    this.price = this.price + 10;
  }
}
