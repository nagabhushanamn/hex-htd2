import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'shopIT';

  products = [
    {
      name: 'Laptop',
      price: 198000,
      description: 'New Model',
      canBuy: true,
      image: 'images/Laptop.png'
    },
    {
      name: 'Mobile',
      price: 18000,
      description: 'New Model',
      canBuy: true,
      image: 'images/Mobile.png'
    }
  ]



  // Event Handler(s)

  currentTab = 1;

  tabChange(event, tabIdx) {
    this.currentTab = tabIdx;
  }

  isTabSelected(tabIdx) {
    return this.currentTab === tabIdx;
  }


} 
