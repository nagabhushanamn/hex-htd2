import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CountDisplayComponent } from './count-display/count-display.component';
import { HitButtonComponent } from './hit-button/hit-button.component';

@NgModule({
  declarations: [
    AppComponent,
    CountDisplayComponent,
    HitButtonComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
