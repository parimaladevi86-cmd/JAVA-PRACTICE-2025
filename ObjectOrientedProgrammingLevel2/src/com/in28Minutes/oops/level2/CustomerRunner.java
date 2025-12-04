package com.in28Minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		 Address homeAddress = new Address("Elite","Chennai","546321");
		 Customer customer = new Customer("Parimala",homeAddress);
		 System.out.println(customer);
		 Address workAddress = new Address("company","Chennai","678432");
		 customer.setWorkAddress(workAddress);
		 System.out.println(customer);
	}
	
	

}
