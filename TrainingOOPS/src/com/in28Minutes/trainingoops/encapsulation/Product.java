package com.in28Minutes.trainingoops.encapsulation;

public class Product {
	private String productName;
	private double price;
	private int quantity;
	//private double totalValue;

	
	public Product(String productName, double price, int quantity) {
		if (productName == null || productName.isEmpty()) {
			throw new IllegalArgumentException("productName cannot be empty");
		}  
		else {
			this.productName=productName;
		}
		if (!setPrice(price)) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
     

		if (!setQuantity(quantity)) {
         throw new IllegalArgumentException("Price must be greater than zero");
     }
   
		 
	}

	

	public boolean setProductName(String productName) {
		if (productName == null || productName.trim().isEmpty()) {
			return false;
		}
		this.productName = productName;
		return true;
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
	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}

	public boolean setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
			return true;
		} else {

			return false;
		}
	}
	/*
	 * public double getTotalValue(String productName, double price, int quantity) {
	 * if (quantity >= 0 && price >0) { double totalValue =price * quantity;
	 * //System.out.println(totalValue); return totalValue; } return -1; }
	 */

	
	/*
	 * public double setTotalValue(String productName, double price, int quantity) { if
	 * (quantity >= 0 && price >0) { double totalValue =price * quantity; return
	 * totalValue; } return -1; }
	 */
	 
	public double getTotalValue() {
		   
			return price*quantity;
		}
	@Override
	public String toString() {
		 
		return "[productName=" + productName + 
				", price=" + price + 
				", quantity=" + quantity + 
				", totalValue=" + price*quantity + "]";
	}

	 


	 

	
}
