import {Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import {FormGroup, FormBuilder} from '@angular/forms';

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

  reviewForm: FormGroup;


  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.reviewForm = this.fb.group({
      stars: ['5'],
      author: [''],
      comment: ['']
    });
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

  submitNewReview(product) {
    product.reviews.push(this.reviewForm.value);
    this.reviewForm.reset();
  }

}
