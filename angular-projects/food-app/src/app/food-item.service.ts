import { Injectable } from '@angular/core';
import { FoodItem, foodType } from './FoodItem';

@Injectable({
  providedIn: 'root'
})
export class FoodItemService {

  itemList:Array<FoodItem>=[
    {
      itemCode:1001,
      itemName:'Burger',
      isVeg:foodType.nonveg,
      type:'Snacks',
      price:99

    },
    {
      itemCode:1002,
      itemName:'Pizza',
      isVeg:foodType.nonveg,
      type:'Lunch',
      price:199

    }

  ];

  constructor() { }

  public addFoodItem(foodItem:FoodItem){

    
    this.itemList.push(foodItem);
  }

  public deleteFoodItem(itemCode:any){
    let index = -1;
    for(let item of this.itemList){
      index++;
      if(itemCode==item.itemCode){
        break;
      }
      
    }
    this.itemList.splice(index,1);
  }
  

}
