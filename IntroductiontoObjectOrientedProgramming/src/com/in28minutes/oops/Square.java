package com.in28minutes.oops;

public class Square {
	 private int side,area,perimeter;

	    public Square(int side) {
	        // TODO: Initialize side with the passed value
	        this.side=side;
	        if(this.side<=0)
	        {
	            this.area=-1;
	            this.perimeter=-1;
	        }
	        else
	        {
	            this.area=side*side;
	            this.perimeter=4*side;
	        }
	    }

	    public int calculateArea() {
	        // TODO: Calculate and return the area of the square
	        return area;
	    }

	    public int calculatePerimeter() {
	        // TODO: Calculate and return the perimeter of the square
	        return perimeter;
	    }
}
