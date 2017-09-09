import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'app';
  totalCount = 0;

  constructor() {
    console.log('AppComponent instantiated');
  }

  inc(val) {
    console.log('handling hit-event');
    this.totalCount += Number.parseInt(val);
  }

}
