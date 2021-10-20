package statickeyword;

public class MainClass {

	public static void main(String[] args) {
		
		Car.noOfWheels=4;
		Car.staticMethod();
		
		Car car1=new Car(100101,"RED");
		
		Car car2=new Car(200001,"WHITE");
		
		car1.showCarDetails();
		
		car2.showCarDetails();
		

	}

}
