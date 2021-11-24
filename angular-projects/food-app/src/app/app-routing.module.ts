import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFoodItemComponent } from './add-food-item/add-food-item.component';
import { ViewFoodItemComponent } from './view-food-item/view-food-item.component';

const routes: Routes = [
  {
    path:'add-item', component:AddFoodItemComponent
  },
  {
    path:'view-item', component:ViewFoodItemComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
