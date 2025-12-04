package com.in28Minutes.oops.level2;

public class Rectangle {
	
	private int length;
	private int breadth;
	 
	
	public Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public int area(int length, int breadth){
		int area=length*breadth;
		return area;
		
	}
	
	public int perimeter(int length, int breadth){
		int perimeter = (2*(length+breadth));
		return perimeter;
		
	}
	
public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


public String toString() {
	return String.format("length:%d breadth:%d Area:%d Perimeter:%d",
			              length,breadth,area(length, breadth),perimeter(length, breadth));
	
}
}
