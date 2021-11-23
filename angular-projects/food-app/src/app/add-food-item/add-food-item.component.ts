import { Component, OnInit } from '@angular/core';
import { FoodItem } from '../FoodItem';

@Component({
  selector: 'app-add-food-item',
  templateUrl: './add-food-item.component.html',
  styleUrls: ['./add-food-item.component.css']
})
export class AddFoodItemComponent implements OnInit {

  foodItems:Array<FoodItem>=[];
  constructor() { }

  ngOnInit(): void {
  }

  addFoodItem(foodItem:FoodItem){
    console.log(foodItem);
    this.foodItems.push(foodItem);
  }

}
