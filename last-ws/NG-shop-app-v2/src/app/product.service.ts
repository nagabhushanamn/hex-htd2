import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable()
export class ProductService {

  apiUrl = 'http://0.0.0.0:3000/api/products'

  constructor(private http: Http) { }

  loadAll() {
    let stream1: Observable<Response> = this.http.get(this.apiUrl)
    let stream2: Observable<Array<any>> = stream1.map(resp => resp.json());
    return stream2;
  }

  loadAllReviews(prodId) {
    return this.http.get(`${this.apiUrl}/${prodId}/reviews`)
      .map(resp => resp.json());
  }

  submitNewReview(prodId, review) {
    return this.http.post(`${this.apiUrl}/${prodId}/reviews`, review)
      .map(resp => resp.json());
  }

}
