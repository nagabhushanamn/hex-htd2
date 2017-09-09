import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl, FormBuilder, Validators} from '@angular/forms';

import {myRangeValidator,myEmailMatchValidator} from '../my-validators'

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent implements OnInit {


  employeeFormGroup: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit() {

    //    this.employeeFormGroup = new FormGroup({
    //      firstName: new FormControl(),
    //      lastName: new FormControl(),
    //      email: new FormControl(),
    //      sendCatalog: new FormContra
    //    });

    this.employeeFormGroup = this.fb.group({
      firstName: ['', [Validators.required, Validators.minLength(3)]],
      lastName: [''],
      emailGroup:this.fb.group({
       email: ['', [Validators.required,Validators.email]],
       confirmEmail:['',[Validators.required,Validators.email]]
      },{validator:myEmailMatchValidator}),
      mobile: [''],
      sendCatalog: [true],
      sendNotification: ['email'],
      range:['',[myRangeValidator(10,20)]]
    });

  }

  toggleNotification(noti) {
    if (noti === "sms") {
      let mobileControl = this.employeeFormGroup.get('mobile');
      mobileControl.setValidators([Validators.required]);
      mobileControl.updateValueAndValidity();
    }
  }


  loadEmployee() {
    let empRecord = {
      firstName: 'Nag',
      lastName: 'N',
      //email: 'nag@email.com'
    }
    //this.employeeFormGroup.setValue(empRecord);
    this.employeeFormGroup.patchValue(empRecord);
  }

}
