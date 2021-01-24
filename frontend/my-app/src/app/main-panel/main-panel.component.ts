import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-panel',
  templateUrl: './main-panel.component.html',
  styleUrls: ['./main-panel.component.css']
})
export class MainPanelComponent implements OnInit {
  name = 'Lukasz';
  pi = Math.PI;
  date = new Date();

  constructor() {

  }

  ngOnInit(): void {
  }

  login(): void {
    console.log("Kliknięte zostało")
  }

}
