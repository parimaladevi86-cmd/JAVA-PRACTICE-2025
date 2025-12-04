package com.in28Minutes.trainingoops.encapsulation;

public class MenuItem {

	private String itemName;
	private double price;
	// private double quantity;
	private String restaurantName;
	private boolean isAvailable;

	public MenuItem(String itemName, double price, String restaurantName, boolean isAvailable) {
		if (itemName == null || itemName.trim().isEmpty()||itemName.trim().equalsIgnoreCase("null")) {
			throw new IllegalArgumentException("itemName cannot be empty");
		}  
			this.itemName = itemName.trim();
		 
		if (price<=0) {
			throw new IllegalArgumentException("Price must be greater than zero");
		}  
			this.price = price;
		 

		if (restaurantName == null || restaurantName.trim().isEmpty()||restaurantName.trim().equalsIgnoreCase("null")) {
			throw new IllegalArgumentException("restaurantName cannot be empty");
		}  
			this.restaurantName = restaurantName.trim();
		 
		/*
		 * if (!setQuantity(quantity)) { throw new
		 * IllegalArgumentException("Price must be greater than zero"); } else {
		 * this.quantity = quantity; }
		 */

		this.isAvailable = isAvailable;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/*
	 * public double getQuantity() { return quantity; }
	 * 
	 * public boolean setQuantity(double quantity) { if (quantity > 0) {
	 * this.quantity = quantity; return true; } else {
	 * 
	 * return false; } }
	 */

	public String getItemName() {
		return itemName;
	}

	public boolean setItemName(String itemName) {

		if (itemName == null || itemName.trim().isEmpty()||itemName.trim().equalsIgnoreCase("null")) {

			return false;
		} else {

			this.itemName = itemName.trim();

			return true;
		}
	}

	public double getPrice() {
		return price;
	}

	public boolean setPrice(double price) {
		if (price > 0) {
			this.price = price;
			return true;
		} else {

			return false;
		}
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public boolean setRestaurantName(String restaurantName) {
		if (restaurantName == null || restaurantName.trim().isEmpty()||restaurantName.trim().equalsIgnoreCase("null")) {
			return false;
		} else {
			this.restaurantName = restaurantName.trim();
			return true;
		}

	}

	public double getTotalCost(int quantity) {
       if(quantity <1) {
    	   throw new IllegalArgumentException("Quantity must be greater than or equal to 1");
       }
		return price * quantity;

	}

	@Override
	public String toString() {
		return "MenuItem [itemName=" + itemName + ", price=" + price + ", restaurantName=" + restaurantName
				+ ", isAvailable=" + isAvailable + "]";
	}

}
