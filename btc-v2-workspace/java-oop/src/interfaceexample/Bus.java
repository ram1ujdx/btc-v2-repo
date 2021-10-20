package interfaceexample;

public class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println("Manual Start");
	}

	@Override
	public void brake() {
		System.out.println("Non ABS Brakes");
	}

	@Override
	public void acclerate() {
		System.out.println("Slow..");
	}

	
	
}
