package com.in28Minutes.trainingoops.Polymorphism.Task1;

public class VegetarianItem {
	private String name;
	 private double price;
	 
	 public VegetarianItem(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		 }
	 public String getName() {
		return name;
	}
	 public void setName(String name) {
		this.name = name;
	 }
	 public double getPrice() {
		return price;
	 }
	 public void setPrice(double price) {
		this.price = price;
	 }
	
	 public void display()
	 {
		 System.out.println("VegItemName:"+name+ ",Price:"+price);
		// System.out.println("Price:"+price);

	 }

}
