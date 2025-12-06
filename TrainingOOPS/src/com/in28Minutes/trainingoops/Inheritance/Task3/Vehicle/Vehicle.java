package com.in28Minutes.trainingoops.Inheritance.Task3.Vehicle;

public class Vehicle {
	private String vehicleType;

	public Vehicle(String vehicleType) {
		 
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public void startEngine() {
		System.out.println(vehicleType +"  is starting");
	}

	public void stopEngine() {
		System.out.println(vehicleType +"  is stopping");
	}

}
