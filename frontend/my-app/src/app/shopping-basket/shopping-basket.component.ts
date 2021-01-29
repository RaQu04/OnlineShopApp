import { Component, OnInit } from '@angular/core';
import {ShoppingItem} from '../shopping-item/shopping-item';


@Component({
  selector: 'app-shopping-basket',
  templateUrl: './shopping-basket.component.html',
  styleUrls: ['./shopping-basket.component.css']
})
export class ShoppingBasketComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  items: ShoppingItem[] = [
    {desc: "Awesome T-Shirt", price: 30},
    {desc: "Arduino", price: 50},
    {desc: "Raspberry PI", price: 80},
    {desc: "Xbox One", price: 300},
    {desc: "Inflatable Unicorn", price: 40}
  ];

  total() {
    return this.items.reduce((total, item) => total + item.price, 0);
  }

  removeItem(item: ShoppingItem) {
    this.items = this.items.filter((i) => i !== item);
  }

}
