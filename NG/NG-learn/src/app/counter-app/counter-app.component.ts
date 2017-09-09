import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter-app.component.html',
  styleUrls: ['./counter-app.component.css']
})
export class CounterAppComponent implements OnInit {

  totalCount = 0;

  constructor() {}

  ngOnInit() {
  }


  inc(val) {
    this.totalCount += Number.parseInt(val);
  }
}
