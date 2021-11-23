import { Component, OnInit } from '@angular/core';
import { FoodItemService } from '../food-item.service';
import { FoodItem } from '../FoodItem';

@Component({
  selector: 'app-add-food-item',
  templateUrl: './add-food-item.component.html',
  styleUrls: ['./add-food-item.component.css']
})
export class AddFoodItemComponent implements OnInit {

 
  constructor(private _foodItemService:FoodItemService) { }

  ngOnInit(): void {
  }

  addFoodItem(foodItem:FoodItem){
    console.log(foodItem);
    this._foodItemService.addFoodItem(foodItem);
  }

}
