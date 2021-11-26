import { analyzeAndValidateNgModules } from "@angular/compiler";
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { FoodItemApiService } from "../food-item-api.service";
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


    foodItems:Array<FoodItem>=[];

    constructor(public _foodItemService:FoodItemService, private _FoodItemApiService:FoodItemApiService, private _router:Router){

    }

    deleteFoodItem(item:FoodItem){
        if(confirm("Sure to delete?")){
       // this._foodItemService.deleteFoodItem(item.itemCode);
       let itemCode:any=item.itemCode;
       this._FoodItemApiService.deleteFoodItem(itemCode).subscribe(
           response=>{
               alert("Item Deleted");
           }
       )
        }
    }

    update(item:FoodItem){
        this._router.navigate(['/update-item/'+item.itemCode]);
    }

    ngOnInit(){

        this._FoodItemApiService.fetchAllFoodItems().subscribe(
            response=>{
                this.foodItems=response;
            }
        )


    }


}