package com.in28Minutes.trainingoops.Inheritance.Task4.MenuItem;

public class MenuItem {
	private String itemName;
	private double price;
	private String restaurantName;
	
	public MenuItem(String itemName, double price, String restaurantName) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.restaurantName = restaurantName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	
	public void display()
	{
		System.out.println("Item Name:"+       itemName);
		System.out.println("Price:"+           price);
		System.out.println("RestaurantName:"+  restaurantName);
		
	}
}
