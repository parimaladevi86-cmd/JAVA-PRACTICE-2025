package com.in28Minutes.trainingoops.Inheritance.Task4.MenuItem;

public class NonVegItem extends MenuItem {
private String meatType;

public NonVegItem(String itemName, double price, String restaurantName, String meatType) {
	super(itemName, price, restaurantName);
	this.meatType = meatType;
}

public String getMeatType() {
	return meatType;
}

public void setMeatType(String meatType) {
	this.meatType = meatType;
}
@Override
public void display() {
	super.display();
	System.out.println("MeatType:"+meatType);
	 
	
}
}
