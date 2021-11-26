import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddFoodItemComponent } from './add-food-item/add-food-item.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ViewFoodItemComponent } from './view-food-item/view-food-item.component';
import { NavComponent } from './nav/nav.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { AddFoodItemReactiveComponent } from './add-food-item-reactive/add-food-item-reactive.component';
import { CodepPipe } from './codep.pipe';


@NgModule({
  declarations: [
    AppComponent,
    AddFoodItemComponent,
    HeaderComponent,
    FooterComponent,
    ViewFoodItemComponent,
    NavComponent,
    UpdateItemComponent,
    AddFoodItemReactiveComponent,
    CodepPipe,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
