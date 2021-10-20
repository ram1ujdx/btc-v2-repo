package interfaceexample;

public class Car extends FourWheeler implements Vehicle{

	@Override
	public void acclerate() {
		System.out.println("Medium Accleration");
	}
	
	@Override
	public void brake() {
		System.out.println("ABS Disc Brakes");
	}
	
	@Override
	public void start() {
		System.out.println("Auto Start");
	}
}
