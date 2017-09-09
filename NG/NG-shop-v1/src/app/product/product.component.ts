import {Component, OnInit, Input, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  @Input()
  idx;

  @Input()
  product;

  @Output()
  buy = new EventEmitter();

  constructor() {}

  ngOnInit() {
  }


  // event handlers

  currentTab = 1;

  changeTab(tabIdx) {
    this.currentTab = tabIdx;
  }

  isTabSelected(tabIdx) {
    return this.currentTab === tabIdx;
  }

  handleBuyBtn() {
    console.log('emitting buy event');
    this.buy.emit(this.product);
  }

}
