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

  cartFlag = false;

  products = [
    {
      name: 'Laptop',
      price: 120000,
      discount: 20000,
      currency: 'INR',
      description: 'New Model',
      makeDate: Date.now(),
      canBuy: true,
      image: 'images/Laptop.png',
      reviews: [
        {stars: '5', author: 'nag@gmail.com', comment: 'good one'},
        {stars: '3', author: 'indu@gmail.com', comment: 'bad one'}
      ]
    },
    {
      name: 'Mobile',
      price: 12000,
      description: 'New Model',
      makeDate: Date.now(),
      canBuy: true,
      currency: 'INR',
      image: 'images/Mobile.png',
      reviews: [
        {stars: '5', author: 'nag@gmail.com', comment: 'good one'},
        {stars: '3', author: 'indu@gmail.com', comment: 'bad one'}
      ]
    }
  ]


  showCart(flag) {
    this.cartFlag = flag;
  }
  addToCart(item) {
    this.cart.push(item);
  }


}
