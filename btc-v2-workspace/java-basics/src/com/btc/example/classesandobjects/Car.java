package com.btc.example.classesandobjects;

public class Car {

	String regNo;
	String color;
	double exShowroomPrice;
	String model;
	public void start() {
		System.out.println("Engine Started...");
	}
	
	public void accelerate() {
		System.out.println("Car running...");
	}
	
	public void brake() {
		System.out.println("Brake Applied");
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", color=" + color + ", exShowroomPrice=" + exShowroomPrice + ", model=" + model
				+ "]";
	}
	
	
	
}
