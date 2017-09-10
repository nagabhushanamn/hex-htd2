import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

import {AppComponent} from './app.component';
import {PMHomeComponent} from './pmhome/pmhome.component';
import {HomeComponent} from './home/home.component';
import {ProductListComponent} from './product-list/product-list.component';
import {ProductService} from './product.service';
import {HttpClientModule} from '@angular/common/http';
import {PMHomeWelcomeComponent} from './pmhome-welcome/pmhome-welcome.component';
import {ProductFormComponent} from './product-form/product-form.component';
import { ReactiveFormsModule } from '@angular/forms';


let routes: Routes = [
  {
    path: 'pm',
    component: PMHomeComponent,
    children: [
      {
        path: '',
        component: PMHomeWelcomeComponent
      },
      {
        path: 'new',
        component: ProductFormComponent
      },
      {
        path: 'products',
        component: ProductListComponent
      }
    ]
  },
  {path: '', component: HomeComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    PMHomeComponent,
    HomeComponent,
    ProductListComponent,
    PMHomeWelcomeComponent,
    ProductFormComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule {}
