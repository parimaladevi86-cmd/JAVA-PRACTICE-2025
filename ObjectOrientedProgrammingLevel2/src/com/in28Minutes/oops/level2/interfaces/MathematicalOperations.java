package com.in28Minutes.oops.level2.interfaces;


interface Operation {
    int perform(int x, int y);
}
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
    	System.out.println(x+y);
		return x+y;
        
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
    	return x-y;
    }
}

class Divide implements Operation {
    @Override
    
    public int perform(int x, int y) {
    if(y==0) {
    	return -1;
    }
    else {
    	return x/y;
    }
}}
public class MathematicalOperations {

	public static void main(String[] args) {
		Operation[] operations = { new Add(),new Subtract(), new Divide() };
	       for(Operation operation:operations) {
	    	   operation.perform(50, 10);

	}
	}
}

