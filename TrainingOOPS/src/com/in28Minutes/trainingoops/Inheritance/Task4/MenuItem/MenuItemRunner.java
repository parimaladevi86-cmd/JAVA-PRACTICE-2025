package com.in28Minutes.trainingoops.Inheritance.Task4.MenuItem;

public class MenuItemRunner {

	public static void main(String[] args) {
		 MenuItem menu = new MenuItem("Gobi65", 300, "Mirchi");
		 VegItem veg = new VegItem("Idli", 100,"A2B", false, "toospicy");
		 NonVegItem nonveg = new NonVegItem("Chicken65", 250, "thalapakatti", "chicken");
		 
		 System.out.println("Menu Details");
		 menu.display();
		 System.out.println( );
		 
		 System.out.println("Vegetarian Details");
		 veg.display();
		 System.out.println( );

		 
		 System.out.println("Non Vegetarian Details");
		 nonveg.display();
		 System.out.println( );
	}

}
