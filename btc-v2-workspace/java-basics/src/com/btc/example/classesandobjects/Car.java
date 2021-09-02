package com.btc.example.classesandobjects;

public class Car {

	String regNo;
	String color;
	double exShowroomPrice;
	String model;
	public void start() {
		System.out.println("Engine Started...");
	}
	
	public Car() {
		
	}
	
	public Car(String regNo, String color,	double exShowroomPrice, String model) {
		
		this.regNo=regNo;
		this.color=color;
		this.exShowroomPrice=exShowroomPrice;
		this.model=model;
		
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
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Car object Garbage Collected");
	}
	
	
}
