package Thread;


public class Announimous_Runnable {
	void printName(){
		System.out.println("  Deepak singh  "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Announimous_Runnable r1 = new Announimous_Runnable();
		
		Thread threadt1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				r1.printName();
			}
		});
		
		
        Thread threadt2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				r1.printName();
			}
		});
        
        threadt1.setName("ravi");
        threadt2.setName("Lavi");
		
		threadt1.start();;
		threadt2.start();
	}

}
