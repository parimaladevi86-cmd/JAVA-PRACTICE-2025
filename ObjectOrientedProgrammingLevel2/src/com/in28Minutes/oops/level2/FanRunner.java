package com.in28Minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
	 Fan fan= new Fan("manufacturer1",3.65,"red");
	 fan.switchOn();
	 System.out.println(fan);
	 fan.setSpeed((byte) 4);
	 System.out.println(fan);
	 fan.switchOff();
	 System.out.println(fan);
	}

}
