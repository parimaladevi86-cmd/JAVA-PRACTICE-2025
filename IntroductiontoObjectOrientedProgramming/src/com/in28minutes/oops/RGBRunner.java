package com.in28minutes.oops;

public class RGBRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB rgb =new RGB(255,0,0);
		System.out.println(rgb.getRed());
		System.out.println(rgb.getGreen());
		System.out.println(rgb.getBlue());
		rgb.invert();
		System.out.println(rgb.getRed());
		System.out.println(rgb.getGreen());
		System.out.println(rgb.getBlue());
		

	}

}
