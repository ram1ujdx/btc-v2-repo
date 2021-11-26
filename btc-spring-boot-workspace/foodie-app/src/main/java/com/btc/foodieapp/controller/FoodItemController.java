package com.btc.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btc.foodieapp.dao.FoodItemDao;

import com.btc.foodieapp.model.FoodItem;

@RestController
@CrossOrigin
@RequestMapping("/api/food-items")
public class FoodItemController {

	@Autowired
	private FoodItemDao dao;
	
	@GetMapping("/{itemCode}")
	public FoodItem getFoodiTFoodItem(@PathVariable long itemCode) {
		return dao.findById(itemCode).get();
	}
	
	@PostMapping
	public FoodItem addFoodItem(@RequestBody FoodItem item) {
		return dao.save(item);
	}
	
	@GetMapping
	public List<FoodItem> getAllItems(){
		return dao.findAll();
	}
	
	@DeleteMapping("/{itemCode}")
	public void deleteFoodItem(@PathVariable long itemCode) {
		dao.deleteById(itemCode);
	}
	
	@PutMapping
	public FoodItem updateFoodItem(@RequestBody FoodItem item) {
		return dao.save(item);
	}
}
