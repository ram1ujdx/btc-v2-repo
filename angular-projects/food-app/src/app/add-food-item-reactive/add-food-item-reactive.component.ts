import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-food-item-reactive',
  templateUrl: './add-food-item-reactive.component.html',
  styleUrls: ['./add-food-item-reactive.component.css']
})
export class AddFoodItemReactiveComponent implements OnInit {

  constructor(private _formBuilder:FormBuilder) { }

  // foodItemForm=new FormGroup(
  //   {
  //     itemCode:new FormControl(''),
  //     itemName:new FormControl(''),
  //     price:new FormControl(''),
  //     type:new FormControl(''),
  //     isVeg:new FormControl('')
  //   }
  // )

  foodItemForm=this._formBuilder.group(
    {
      itemCode:['',[Validators.required]],
      itemName:['',[Validators.required,Validators.minLength(2)]],
      price:[''],
      type: [''],
      isVeg:['']
    }
  )

  ngOnInit(): void {
  }

}
