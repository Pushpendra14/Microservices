package com.synechron;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	public int square(int num) {
		return num * num;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int product(int num1, int num2) {
		return num1 * num2;
	}
}
