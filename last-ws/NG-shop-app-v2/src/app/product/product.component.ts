import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  reviewForm: FormGroup;

  @Input()
  item;

  @Output()
  buy = new EventEmitter();

  currentTab = 1;

  constructor(private fb: FormBuilder, private productService: ProductService) {
    console.log('product.component instantiated..');
  }

  ngOnInit() {
    this.reviewForm = this.fb.group({
      stars: ['5', Validators.required],
      author: ['', [Validators.required, Validators.email]],
      message: ['', Validators.required]
    });
  }

  buyClickHandler() {
    this.buy.emit(this.item);
  }

  changeTabHandler(event, tab) {
    event.preventDefault();
    this.currentTab = tab;

    if (this.currentTab === 3) {
      this.productService.loadAllReviews(this.item.id)
        .subscribe(reviews => {
          this.item.reviews = reviews;
        });
    }

  }

  isTabSelected(tab) {
    return this.currentTab === tab;
  }

  addNewReview() {
    if (this.reviewForm.valid) {
      this.productService.submitNewReview(this.item.id, this.reviewForm.value)
        .subscribe(review => {
          this.item.reviews.push(review)
        });
      this.reviewForm.reset();
    }
  }

}
