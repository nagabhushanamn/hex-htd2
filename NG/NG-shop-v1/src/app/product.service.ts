import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ProductService {

  constructor(private _httpClient:HttpClient) { }

  getProducts() {
    let apiUrl="http://localhost:8080/api/products";
    return this._httpClient.get(apiUrl);
  }

}
