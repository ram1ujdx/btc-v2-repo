import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFoodItemReactiveComponent } from './add-food-item-reactive/add-food-item-reactive.component';
import { AddFoodItemComponent } from './add-food-item/add-food-item.component';
import { UpdateItemComponent } from './update-item/update-item.component';
import { ViewFoodItemComponent } from './view-food-item/view-food-item.component';

const routes: Routes = [
  {
    path:'add-item', component:AddFoodItemComponent
  },
  {
    path:'view-item', component:ViewFoodItemComponent
  },
  {
    path:'update-item/:item-code', component:UpdateItemComponent
  },
  {
    path:'add-item-reactive', component:AddFoodItemReactiveComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
