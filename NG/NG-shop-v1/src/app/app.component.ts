import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // properties

  title = 'shop-IT';

  cart: Array<any> = []

  products = [
    {
      name: 'Laptop',
      price: 120000,
      description: 'New Model',
      canBuy: true,
      image: 'images/Laptop.png'
    },
    {
      name: 'Mobile',
      price: 12000,
      description: 'New Model',
      canBuy: true,
      image: 'images/Mobile.png'
    }
  ]

  addToCart(item) {
    this.cart.push(item);
  }


}
