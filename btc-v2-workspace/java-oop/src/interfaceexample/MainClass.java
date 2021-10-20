package interfaceexample;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle vehicle= new Car();
		
		vehicle.acclerate();
		vehicle.start();
		vehicle.brake();
		
		
		vehicle = new Bus();
		
		vehicle.acclerate();
		vehicle.start();
		vehicle.brake();
		

	}

}
