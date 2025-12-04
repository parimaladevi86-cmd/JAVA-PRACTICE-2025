package com.in28Minutes.oops.level2.inheritance;


abstract class Animal{
	abstract void bark();
}

class dog extends Animal{
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class cat extends Animal{
	public void bark() {
		System.out.println("meow meow");
	}
}

public class AnimalRunner {

	public static void main(String[] args) {
      Animal[] animals= {new dog(), new cat()};
      for(Animal animal:animals) {
    	animal.bark();
      }

	}

}
