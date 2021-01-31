import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  typesOfCategory: string[] = ['Nieruchomości', 'Motoryzacja', "Moda", 'Zabawki', 'Gry'];
  typesOfAuction: string[] = ['Ostatnio dodane', 'Kończące się', "Wystawione przez użytkownika", "Licytowane przerz użytkownika", "Obserwowane", 'Właśnie zakończone'];
}
