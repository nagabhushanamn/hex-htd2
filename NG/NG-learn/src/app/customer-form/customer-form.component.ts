import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-customer-form',
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.css']
})
export class CustomerFormComponent implements OnInit {

  // data-model
  customerModel;

  constructor() {}

  ngOnInit() {
    this.customerModel = {
      firstName: 'Nag',
      lastName: ''
    }
  }


  saveCustomer(customerFormGroup) {
    if (customerFormGroup.valid) {
      console.log(customerFormGroup.value);
    }
  }



}
