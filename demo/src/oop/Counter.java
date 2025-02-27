package oop;

public class Counter {
	// Instance variable 
    private int value;
    
    // Methods 
    public void inc() {
    	value ++;
    }
    
    public void dec() {
    	if (value > 0)
    	     value --;
    }
    
    public int getValue() {
    	return value;
    }
    
    public void reset() {
    	value = 0;
    }
}
