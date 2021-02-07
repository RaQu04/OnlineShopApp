import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
  private categoryName: string;

  constructor(private router: ActivatedRoute) {}


  ngOnInit(): void {
    this.router.params.subscribe((params:Params) => {
      this.categoryName = params['categoryName']
    })
  }


}
