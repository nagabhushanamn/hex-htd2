import {ProductService} from '../product.service';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: any = [];
  message='';

  constructor(private productService: ProductService) {}

  ngOnInit() {
    this.productService.loadAllProducts()
      .subscribe((products) => {
        this.products = products;
      });
  }

  delete(id) {
    this.productService.delete(id)
      .subscribe((id)=>{
        this.products=this.products.filter(item=>item.id!==id)
        this.message="Item has deleted successfully";
      })
  }

}
