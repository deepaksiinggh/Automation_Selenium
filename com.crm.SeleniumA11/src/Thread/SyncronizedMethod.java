package Thread;

public class SyncronizedMethod {
	public synchronized void addNumber() {
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		SyncronizedMethod m1 = new SyncronizedMethod();
	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			m1.addNumber();
		}
	});
	
Thread t2 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			m1.addNumber();
		}
	});
	
	t1.start();
	t2.start();

	}

}
