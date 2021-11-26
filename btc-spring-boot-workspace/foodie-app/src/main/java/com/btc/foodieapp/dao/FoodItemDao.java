package com.btc.foodieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btc.foodieapp.model.FoodItem;

public interface FoodItemDao extends JpaRepository<FoodItem, Long>{

}
