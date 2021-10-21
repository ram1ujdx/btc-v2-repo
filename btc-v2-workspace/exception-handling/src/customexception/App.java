package customexception;

public class App {

	public static void main(String[] args) {
		
		
		PersonDetails pd=new PersonDetails();
	
		
		try {
			pd.readPersonDetails();
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println(pd);
				
		

	}

}
