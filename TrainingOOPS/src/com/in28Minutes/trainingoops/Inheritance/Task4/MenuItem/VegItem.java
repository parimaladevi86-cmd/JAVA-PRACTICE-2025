package com.in28Minutes.trainingoops.Inheritance.Task4.MenuItem;

public class VegItem extends MenuItem {
	private boolean isJainFriendly;
	private String spiceLevel;
	public VegItem(String itemName, double price, String restaurantName,boolean isJainFriendly,String spiceLevel) {
		super(itemName, price, restaurantName);
	 this.isJainFriendly= isJainFriendly;
	 this.spiceLevel=spiceLevel;
	}
	public boolean isJainFriendly() {
		return isJainFriendly;
	}
	public void setJainFriendly(boolean isJainFriendly) {
		this.isJainFriendly = isJainFriendly;
	}
	public String getSpiceLevel() {
		return spiceLevel;
	}
	public void setSpiceLevel(String spiceLevel) {
		this.spiceLevel = spiceLevel;
	}
	@Override
public void display() {
	super.display();
	System.out.println("JainFriendly:"+isJainFriendly);
	System.out.println("SpiceLevel:"+spiceLevel);
	
}
}
