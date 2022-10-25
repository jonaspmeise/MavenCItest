package com.mycompany.app.my_app;

public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double squareRoot(double a) throws IllegalArgumentException {
    	if(Math.abs(a) == a) {
    		return Math.sqrt(a);
    	} else {
    		throw new IllegalArgumentException("Negative value not allowed");
    	}
    }
}