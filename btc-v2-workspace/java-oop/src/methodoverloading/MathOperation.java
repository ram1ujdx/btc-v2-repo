package methodoverloading;

public class MathOperation {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	
	public float add(float a, float b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		
		MathOperation obj=new MathOperation();
		
		System.out.println(obj.add(6, 7));
		
		System.out.println(obj.add(2.6F, 3.2F));
		
		System.out.println(obj.add(3, 2.5f));
		
		System.out.println(obj.add(6,7 , 8));
		
	}
	
	
}
