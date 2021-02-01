import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-category-electronic',
  templateUrl: './category-electronic.component.html',
  styleUrls: ['./category-electronic.component.css']
})
export class CategoryElectronicComponent implements OnInit {

  description: string;
  constructor() { }

  ngOnInit(): void {
  }

  public getDescriptionDell(): string {
    return '<div> <p>Ekran 15.6", 1920 x 1080px, 60Hz</p> <p>Procesor Intel Core i5-10300H</p> <p>Wielkość pamięci RAM[GB] 8</p>  <p>Dysk 512 GB SSD</p>  <p>Karta graficzna NVIDIA GeForce GTX 1650 TI</p> <p>System operacyjny Windows 10 Home</p></div>';
  }

}
