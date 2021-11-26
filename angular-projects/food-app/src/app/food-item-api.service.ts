import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { FoodItem } from './FoodItem';

@Injectable({
  providedIn: 'root'
})
export class FoodItemApiService {

  constructor(private _httpClient:HttpClient) { }
  base_url="http://localhost:8000/api/food-items"

  public addFoodItem(item:FoodItem):Observable<FoodItem>{
   return this._httpClient.post<FoodItem>(this.base_url,item);
  }

  public fetchFoodItem(itemCode:number):Observable<FoodItem>{
    return this._httpClient.get<FoodItem>(this.base_url+"/"+itemCode);
  }


  public deleteFoodItem(itemCode:number):Observable<any>{
    return this._httpClient.delete<any>(this.base_url+"/"+itemCode);
  }

  public fetchAllFoodItems():Observable<Array<FoodItem>>{
    return this._httpClient.get<Array<FoodItem>>(this.base_url);
  }

  public updateFoodItem(item:FoodItem):Observable<FoodItem>{
    return this._httpClient.put<FoodItem>(this.base_url,item);
   }


}
