package com.in28Minutes.trainingoops.encapsulation;

public class ProductRunner {

	public static void main(String[] args) {

		System.out.println("=== Basic creation and total ===");
        Product product = new Product("Rice", 100, 10);
        System.out.println(product);
        System.out.println();

        System.out.println("=== Mutations with clear printing ===");
        boolean ok;

        ok = product.setQuantity(0);
        System.out.println("Quantity 0:  " + ok  );
        System.out.println(product);
        System.out.println();

        ok = product.setPrice(0); // invalid
        System.out.println("Price 0:  " + ok );
        System.out.println(product);
        System.out.println();

        ok = product.setPrice(-10); // invalid
        System.out.println("NegativePrice :  " + ok );
        System.out.println(product);
        System.out.println();

        ok = product.setProductName(" ");
        System.out.println("No product Name :  " + ok  );
        System.out.println(product);
        System.out.println();

        System.out.println("=== Second product creation ===");
        Product product1 = new Product("Dal", 200, 5);
        System.out.println("Total value: " + product1.getTotalValue());
        System.out.println(product1);
        System.out.println();
		 
			/*
			 * Product product = new Product("Rice", 100, 10); System.out.println(product);
			 * 
			 * 
			 * 
			 * boolean ok = product.setQuantity(0); System.out.println("Quantity 0:  " +"|"+
			 * ok +"|"+ product);
			 * 
			 * boolean ok1 = product.setPrice(0); System.out.println("Price 0:  " +"|"+ ok1
			 * +"|"+ product);
			 * 
			 * 
			 * boolean ok2 = product.setPrice(-90); System.out.println("NegativePrice:  "
			 * +"|"+ ok2+"|"+ product);
			 * 
			 * 
			 * boolean ok3 = product.setProductName("");
			 * System.out.println("No product Name:  " +"|"+ ok3+"|"+ product);
			 * 
			 * 
			 * Product product1 = new Product("Dal", 200, 5); product.getTotalValue();
			 * System.out.println(product1);
			 */
		
	}

}
