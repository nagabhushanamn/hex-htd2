import { Component } from '@angular/core';
import { ProductService } from './product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: []
})
export class AppComponent {

  // properties

  title = 'shop-IT';
  cart: Array<any> = []

  cartFlag = false;

  products: any = []

  // productService:ProductService
  // constructor(productService:ProductService){
  //   this.productService=productService;
  // }

  constructor(private productService: ProductService) { };

  ngOnInit() {
    this.productService.getProducts()
      .subscribe((resp) => {
        this.products = resp;
      }, function (error) {
        console.dir(error)
      });
  }

  showCart(flag) {
    this.cartFlag = flag;
  }
  addToCart(item) {
    this.cart.push(item);
  }


}
