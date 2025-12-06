package com.in28Minutes.trainingoops.Inheritance.Task3.Vehicle;

public class Car extends Vehicle {
	private String carName;

	
	public Car(String vehicleType, String carName) {
		super(vehicleType);
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println(carName +"  is starting");
	}

	@Override
	public void stopEngine() {
		super.stopEngine();
		System.out.println(carName +"  is stopping");
	}
}
