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
  

  public getFoodItem(itemCode:any):FoodItem{
   let item:any = this.itemList.find(item=>item.itemCode==itemCode);
   return item;
  }

  public getFoodItemByName(itemName:any){
    return this.itemList.find(item=>item.itemName==itemName);
  }

  public updateFoodItem(foodItem:FoodItem){
    let itemToUpdate:FoodItem|any;
    itemToUpdate = this.getFoodItem(foodItem.itemCode);

    itemToUpdate.itemName=foodItem.itemName;
    itemToUpdate.isVeg=foodItem.isVeg;
    itemToUpdate.price=foodItem.price;
    itemToUpdate.type=foodItem.type;

  }

}
