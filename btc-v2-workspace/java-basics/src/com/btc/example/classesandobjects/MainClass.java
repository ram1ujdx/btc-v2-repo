package com.btc.example.classesandobjects;

public class MainClass {

	public static void main(String[] args) {
		
		Car ford=new Car();
		ford.regNo="KA05A 4745";
		ford.model="Eco Sports";
		ford.color="Red";
		ford.exShowroomPrice=1150000;
		
		System.out.println(ford);
		
		ford.start();
		ford.accelerate();
		ford.brake();

	}

}
