package Thread;

public class Implements_Runnable implements Runnable {
	@Override
	public void run() {
		printName();
	}

	public void printName() {
		System.out.println("Deepak singh"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("Lavi singh");
		Implements_Runnable t1 = new Implements_Runnable();
		Implements_Runnable t2 = new Implements_Runnable();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Shilpi singh");

	}

}
