package com.in28Minutes.trainingoops.encapsulation;

public class BankAccountRunner {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);
		System.out.println("Initial Amount:" + acc);

		boolean ok = acc.deposit(1000);
		System.out.println("Deposited amount:  " + ok + acc);

		ok = acc.withdraw(200);
		System.out.println("withdrawed amount:  " + ok + acc);

		ok = acc.withdraw(2000);
		System.out.println("withdrawed amount:  " + ok + acc);

		ok = acc.deposit(-200);
		System.out.println("withdrawed amount:  " + ok + acc);
		
		ok = acc.withdraw(1800);
		System.out.println("withdrawed amount:  " + ok + acc);
		
		ok = acc.withdraw(1);
		System.out.println("withdrawed amount:  " + ok + acc);



		//System.out.println(acc);

	}

}
