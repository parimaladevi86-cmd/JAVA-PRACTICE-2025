package com.in28minutes.oops;

public class Book {
	
	private int noOfCopies;
	
	Book ()
	{
		//this.noOfCopies=50;
		this(60);
		System.out.println("Empty Constructor is called");
	}
	Book (int noOfCopies)
	{
		this.noOfCopies=noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) 
	{ 
		if(noOfCopies>0) {
			//System.out.println("Before NoOfCopies: "+noOfCopies);
		//System.out.println("Before this NoOfCopies: "+this.noOfCopies);
		this.noOfCopies=noOfCopies;
		//System.out.println("After NoOfCopies: "+noOfCopies);
		//System.out.println("After this NoOfCopies: "+this.noOfCopies);
		}
		/*
		 * else { System.out.println("less than 0"); }
		 */
	}
	
	public void increaseNoOfCopies(int howmuch)
	{
		setNoOfCopies(this.noOfCopies+howmuch);
	}
	public void decreaseNoOfCopies(int howmuch)
	{
		setNoOfCopies(this.noOfCopies-howmuch);
	}
	
	/*
	 * public void decreaseNoOfCopies(int howmuch) { if(this.noOfCopies-howmuch>0) {
	 * this.noOfCopies=this.noOfCopies-howmuch; } else {
	 * System.out.println("no of copies is less than 0"); } }
	 */
	
}
	/*
	 * public void setNoOfCopies(int noOfCopies) { if(noOfCopies>0) {
	 * //System.out.println(noOfCopies); //System.out.println(this.noOfCopies);
	 * this.noOfCopies = noOfCopies; //System.out.println(this.noOfCopies); }
	 * //System.out.println("no of copies is less than 0"); }
	 */
	
	
	/*
	 * void setnoOfCopies(int noOfCopies) { this.noOfCopies=noOfCopies;
	 * //ssSystem.out.println(this.noOfCopies); }
	 * 
	 * int getnoOfCopies() {
	 * 
	 * 
	 * return this.noOfCopies; }
	 */

	/*
	 * void read() { System.out.println("Reading the book");
	 * 
	 * }
	 * 
	 * void mark() { System.out.println("Marking important datas in book"); }
	 * 
	 * void print() { System.out.println("Printing important datas in book"); }
	 */

