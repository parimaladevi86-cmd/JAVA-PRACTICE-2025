package com.in28Minutes.trainingoops.Polymorphism.Task1;

import java.util.ArrayList;

public class MenuItemRunner {

	public static void main(String[] args) {
		double vegtotal = 0;
		double nonVegtotal = 0;
		double deserttotal = 0;

		ArrayList<VegetarianItem> vegList = new ArrayList<>();
		ArrayList<NonVegetarianItem> nonvegList = new ArrayList<>();
		ArrayList<Desert> desert = new ArrayList<>();

		// Adding VEG item, displaying it, calculating total
		vegList.add(new VegetarianItem("Idli", 30));
		vegList.add(new VegetarianItem("Dosa", 100));
		vegList.add(new VegetarianItem("Pongal", 50));

		System.out.println("VEG MENU");
		System.out.println("--------------");
		for (VegetarianItem v : vegList) {
			v.display();
		}

		for (VegetarianItem v : vegList) {
			vegtotal += v.getPrice();
		}
		System.out.println("Veg Total Bill:" + vegtotal);

		// Adding NON VEG item, displaying it, calculating total
		nonvegList.add(new NonVegetarianItem("Chicken", 300));
		nonvegList.add(new NonVegetarianItem("FishCurry", 350));
		nonvegList.add(new NonVegetarianItem("Egg Biriyani", 150));

		System.out.println("NONVEG MENU");
		System.out.println("--------------");
		for (NonVegetarianItem n : nonvegList) {
			n.display();
		}

		for (NonVegetarianItem n : nonvegList) {
			nonVegtotal += n.getPrice();
		}
		System.out.println("NonVeg Total Bill:" + nonVegtotal);

		// Adding DESERT item, displaying it, calculating total
		desert.add(new Desert("Ice Cream", 400));
		desert.add(new Desert("Fresh Juice", 200));
		desert.add(new Desert("Vanila cake", 150));

		System.out.println("DESERT MENU");
		System.out.println("--------------");
		for (Desert d : desert) {
			d.display();
		}

		for (Desert d : desert) {
			deserttotal += d.getPrice();
		}
		System.out.println("Desert total  Bill:" + deserttotal);

	}

}
