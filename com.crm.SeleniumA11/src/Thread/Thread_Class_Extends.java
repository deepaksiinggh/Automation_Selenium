package Thread;

public class Thread_Class_Extends extends Thread{
	@Override
	public void run() {
		printName();
	}
	
	public void printName() {
		System.out.println("Deepak singh" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		Thread_Class_Extends t1 = new Thread_Class_Extends();
		Thread_Class_Extends t2 = new Thread_Class_Extends();
		t1.setName("========>>>>>> Ghopi Thread");
		t2.setName("========>>>>>> Gangeo Thread");
		t1.start();
		t2.start();
		System.out.println("Main Ends");
       
	}

}
