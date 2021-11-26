package com.btc.foodieapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FoodItem {

	@Id
	private long itemCode;
    private String itemName;
    private float price;
    private String type;
    private String isVeg;
	
}
