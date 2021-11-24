export class FoodItem{
    itemCode?:number;
    itemName?:string;
    price?:number;
    type?:string;
    isVeg?:foodType

}

export enum foodType{
    veg='veg',
    nonveg='nonveg'
}