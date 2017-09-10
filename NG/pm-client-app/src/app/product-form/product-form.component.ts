import {ProductService} from '../product.service';
import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;

  constructor(private fb: FormBuilder, private productService: ProductService,private router:Router) {}

  ngOnInit() {
    this.productForm = this.fb.group({
      name: [''],
      price: [''],
      makeDate: [''],
      description: ['']
    });
  }

  saveproduct(event) {
    event.preventDefault();
    this.productService.save(this.productForm.value)
      .subscribe((product) => {
        this.router.navigate(['pm/products'])
      });
  }

}
