package Thread;

import java.util.Scanner;

public class Banking {
	Scanner sc = new Scanner(System.in);
	double balance=0;

	public synchronized void withdraw() {
		if(this.balance==0) {
			System.out.println("No money to withdraw funds");
		}else {
			balance=balance-sc.nextDouble();
			System.out.println("Sucessfully withdrawn");
		}
	}
	
	public synchronized void deposit() {
		System.out.println("How much money to add ");
		balance=balance+sc.nextDouble();
		System.out.println("Deposited sucessfully");
	}
}
