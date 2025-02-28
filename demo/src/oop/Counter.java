package oop;

public class Counter {
	// Instance variable 
    private int value;
    
    public Counter() {
    	
    }
    
    public Counter(int initValue) {
       value = initValue;	
    }
    
    // Methods 
    public void inc() {
    	value ++;
    }
    
    public void inc(int step) {
    	value += step;
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
