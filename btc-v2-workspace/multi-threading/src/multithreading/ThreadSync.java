package multithreading;



public class ThreadSync {

	
	public void printTable(int n) {
		
		synchronized (this) {
		for(int i=1 ; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		}

	}
	
	public static void main(String[] args) {
		
		ThreadSync obj=new ThreadSync();
		
		Runnable runnable1 = ()-> obj.printTable(5);
		
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				obj.printTable(7);
				
			}
		};
		
		
		Thread t1=new Thread(runnable1);
		Thread t2=new Thread(runnable2);
		
		t1.start();
		t2.start();
		
		
		
	}
	
	
}
