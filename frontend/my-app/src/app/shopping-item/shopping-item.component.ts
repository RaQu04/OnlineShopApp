import {Component, Input, OnInit, Output, EventEmitter} from '@angular/core';
import {ShoppingItem} from './shopping-item';


@Component({
  selector: 'app-shopping-item',
  templateUrl: './shopping-item.component.html',
  styleUrls: ['./shopping-item.component.css']
})
export class ShoppingItemComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() item: ShoppingItem;
  @Output() onRemove = new EventEmitter<never>();

  remove() {
    this.onRemove.emit();
  }

}
