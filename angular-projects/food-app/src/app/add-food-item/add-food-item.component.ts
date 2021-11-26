import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FoodItemApiService } from '../food-item-api.service';
import { FoodItemService } from '../food-item.service';
import { FoodItem } from '../FoodItem';

@Component({
  selector: 'app-add-food-item',
  templateUrl: './add-food-item.component.html',
  styleUrls: ['./add-food-item.component.css']
})
export class AddFoodItemComponent implements OnInit {

 
  constructor(private _foodItemService:FoodItemService, private _router:Router, private _foodItemApiService:FoodItemApiService) { }

  ngOnInit(): void {
  }

  addFoodItem(foodItem:FoodItem){
    console.log(foodItem);
    // this._foodItemService.addFoodItem(foodItem);
    // this._router.navigate(['/view-item'])
    this._foodItemApiService.addFoodItem(foodItem).subscribe(
      response=>{
        console.log(response);
      },
      err=>{
        console.log(err);
      }
    )
    

  }

}
