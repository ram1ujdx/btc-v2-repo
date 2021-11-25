import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { FoodItemService } from "../food-item.service";
import { FoodItem } from "../FoodItem";

@Component(
    {
        selector:'app-view-food-item',
        templateUrl:'./view-food-item.component.html',
        styleUrls:['./view-food-item.component.css']
    }
)

export class ViewFoodItemComponent implements OnInit{

    constructor(public _foodItemService:FoodItemService, private _router:Router){

    }

    deleteFoodItem(item:FoodItem){
        if(confirm("Sure to delete?")){
        this._foodItemService.deleteFoodItem(item.itemCode);
        }
    }

    update(item:FoodItem){
        this._router.navigate(['/update-item/'+item.itemCode]);
    }

    ngOnInit(){}


}