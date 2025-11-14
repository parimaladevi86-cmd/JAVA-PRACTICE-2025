package com.in28minutes.oops;

 
	
	// Defining a Point class to represent a point in 2-dimensional space
	public class Point {
	    
	    // x-coordinate of the point
	    private int x;

	    // y-coordinate of the point
	    private int y;
	    private int m,n;

	    // Constructor for the Point class
	    public Point(int x, int y) {
	        this.x = x;  // Assigning x-coordinate of the point
	        this.y = y;  // Assigning y-coordinate of the point
	    }

	    // Method to get the x-co;ordinate of the point
	    public int getX() {
	        return x;
	    }

	    // Method to get the y-coordinate of the point
	    public int getY() {
	        return y;
	    }

	    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
	    public void move(int dx, int dy) {
	        // Your code here
	    	System.out.println("INSIDE DISTANCE BEFORE CAL");
	    	this.m=this.x+dx;
	    	this.n=this.y+dy;
	    	System.out.println("INSIDE DISTANCE AFTER CAL");
	    	System.out.println("x:"+this.m+"y:"+this.n);
	    }

	    // TODO: Implement the method to calculate the distance from this point to another point
	    public double distanceTo(Point p2) {
	    	System.out.println("INSIDE DISTANCE BEFORE CAL");
	    	double x1=p2.x-this.x;
	    	double y1=p2.y-this.y;
	        System.out.println("INSIDE DISTANCE AFTER CAL:"+ Math.sqrt(x1*x1+y1*y1));
	        return Math.sqrt(x1*x1+y1*y1);
	    
	        
	        // Your code here
	    }
	}
	/*
	 * // x-coordinate of the point private int x;
	 * 
	 * // y-coordinate of the point private int y; private int a,b,c,m,n,m1,m2;
	 * 
	 * // Constructor for the Point class public Point(int x, int y) { this.x = x;
	 * // Assigning x-coordinate of the point this.y = y; // Assigning y-coordinate
	 * of the point }
	 * 
	 * // Method to get the x-coordinate of the point public int getX() { return x;
	 * }
	 * 
	 * // Method to get the y-coordinate of the point public int getY() { return y;
	 * }
	 * 
	 * 
	 * public void Other(int a, int b) { this.a = a; // Assigning x-coordinate of
	 * the point this.b = b; // Assigning y-coordinate of the point }
	 * 
	 * // Method to get the x-coordinate of the point public int getA() { return a;
	 * }
	 * 
	 * // Method to get the y-coordinate of the point public int getB() { return b;
	 * }
	 * 
	 * 
	 * 
	 * // TODO: Implement the method to move the point by dx and dy in x and y
	 * direction respectively public void move(int dx, int dy) { // Your code here
	 * System.out.println("inside move method"); this.m1=this.x+dx;
	 * this.m2=this.y+dy; //System.out.println(this.x);
	 * //System.out.println(this.y); System.out.println("x:"+this.m1+"y:"+this.m2);
	 * System.out.println("inside move method after calculation" );
	 * 
	 * 
	 * }
	 * 
	 * // TODO: Implement the method to calculate the distance from this point to
	 * another point public double distanceTo(Point other) {
	 * System.out.println("inside point other"); this.m=this.a-this.x;
	 * this.n=this.b-this.y; this.c=a*a+b*b; System.out.println(this.a);
	 * System.out.println(this.b); System.out.println(this.x);
	 * System.out.println(this.y); System.out.println(this.m);
	 * System.out.println(this.n); System.out.println(c); return c;
	 * 
	 * // Your code here }
	 */

