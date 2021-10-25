package lambdaexpression;

public interface MyInterface {

	public void show();
	
	default void test() {
		System.out.println("Blah Blah..");
	}
	
}
