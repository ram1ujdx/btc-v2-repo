import { Injectable } from '@angular/core';
import { FoodItem } from './FoodItem';

@Injectable({
  providedIn: 'root'
})
export class FoodItemService {

  itemList:Array<FoodItem>=[];

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
