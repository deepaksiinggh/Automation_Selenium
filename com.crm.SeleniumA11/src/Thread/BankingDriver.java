package Thread;

public class BankingDriver {

	public static void main(String[] args) {
	Banking b1 = new Banking();
	
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			b1.withdraw();
			System.out.println(Thread.currentThread().getName());
			
		}
	});
	
Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b1.deposit();
			System.out.println(Thread.currentThread().getName());
			
		}
	});

t1.start();
t2.start();

t1.setName("Deepak");
t2.setName("panni");

System.out.println("Thanks");

	}

}
