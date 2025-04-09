package Assignment.Action_Class;

public class Testing {
	
	public void printThread() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Testing t3 = new Testing();
		System.out.println("Main starts");
		
   Thread t1 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		
		t3.printThread();
	}
});
   
   Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			t3.printThread();
			
		}
	});	
   
   t1.start();
   t2.start();
   
   t1.setName("deepak");
   t2.setName("ritesh");
   try {
	t1.join();
	t2.join();
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
   System.out.println("Main Ends");
	}

}
