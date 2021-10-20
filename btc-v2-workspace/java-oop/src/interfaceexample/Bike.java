package interfaceexample;

public class Bike implements Vehicle {

	@Override
	public void acclerate() {
		System.out.println("High Accleration");
	}
	
	@Override
	public void brake() {
		System.out.println("Dual Channel ABS Brakes");
	}
	
	@Override
	public void start() {
		System.out.println("Self and Kick Start");
		
	}
}
