import {Component, OnInit} from '@angular/core';
import {ProductComponent} from '../product/product.component';
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-grid-list',
  templateUrl: './grid-list.component.html',
  styleUrls: ['./grid-list.component.css']
})
export class GridListComponent implements OnInit {


  private categoryName: string;

  constructor(private router: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.router.params.subscribe((params: Params) => {
      this.categoryName = params['categoryName']
    })
  }
}
