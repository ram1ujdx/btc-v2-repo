package com.btc.example.classesandobjects;

public class MainClass {

	public static void main(String[] args) {
		
		Car ford=new Car("KA05A 4745","Red",1150000,"Eco Sports");

		
		System.out.println(ford);
		
		ford.start();
		ford.accelerate();
		ford.brake();
		
		//ford =new Car();
		System.gc();

		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(ford);
		
		ford.start();
		ford.accelerate();
		ford.brake();

	}

}
