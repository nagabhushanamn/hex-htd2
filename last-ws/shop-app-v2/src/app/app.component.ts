import { Component } from '@angular/core';
import { ProductService } from './product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'shopIT';
  items = [];
  cart = [];
  isCartOpen = false;

  constructor(private productService: ProductService) {
  }

  ngOnInit() {
    let stream = this.productService.loadAll();
    stream.subscribe(items => {
      this.items = items;
    });
  }


  addToCart(item) {
    this.cart.push(item);
  }

  showOrHideCart() {
    this.isCartOpen = !this.isCartOpen;
  }

}
