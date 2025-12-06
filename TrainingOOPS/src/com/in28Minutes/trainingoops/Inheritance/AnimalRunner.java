package com.in28Minutes.trainingoops.Inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animal=new Animal();
		Dog d= new Dog();
		Cat c = new Cat();
		System.out.println("Basic Animal Criteria ");
		animal.eat();
		animal.drink();
		animal.sleep();
		animal.actions();
		animal.sound();
		System.out.println( );
		System.out.println("DOG");
		d.eat(); //@override method
		d.drink();// Inherited Method
		d.sleep();// Inherited Method
		d.actions();//Inherited Method
		d.jogging();//Dogs own method
		d.sound();//@override method
		d.bark();//Dogs own method
		System.out.println( );
		
		System.out.println("CAT");
		c.eat();//inherited method
		c.drink();//@override method
		c.sleep();//inherited method
		c.actions();//@override method
		c.sound();//@override method
		

	}

}
