import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable()
export class ProductService {

  apiUrl = 'http://localhost:8080/api/products';

  constructor(private _httpClient: HttpClient) {}

  loadAllProducts() {
    return this._httpClient.get(this.apiUrl);
  }

  save(product) {
    return this._httpClient.post(this.apiUrl,product);
  }
  
  delete(id){
    return this._httpClient.delete(this.apiUrl+"/"+id);
  }

}
