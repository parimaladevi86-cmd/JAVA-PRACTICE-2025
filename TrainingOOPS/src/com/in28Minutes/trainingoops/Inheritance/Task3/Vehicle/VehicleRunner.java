package com.in28Minutes.trainingoops.Inheritance.Task3.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("2 wheeler");
		Car car = new Car("4 wheeler","Altroz");
		
		System.out.println("Vehicle Details");
		System.out.println("=================");
		vehicle.startEngine();
		vehicle.stopEngine();
		System.out.println( );
		
		
		System.out.println("Car Details");
		System.out.println("=================");
		car.startEngine();
		car.stopEngine();
		System.out.println( );
		
		
		
	}

}
