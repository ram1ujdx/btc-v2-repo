package lambdaexpression;

public class MainMethodClass {

	public static void main(String[] args) {
		
		// Approach 1
		
//		MyInterface obj=new MyClass();
//		
//		obj.show();
		
		// Approach 2
		
//		MyInterface obj=new MyInterface() {
//			@Override
//			public void show() {
//				System.out.println("Hi there..");	
//			}
//		};
//		
//
//		obj.show();
		
		// Lambda Expression
		
		MyInterface obj=()->{
						System.out.println("Hi there..");
					};
		

		obj.show();
		
	}

}
