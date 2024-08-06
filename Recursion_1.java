package com.DSA;

public class Recursion_1 {
	static int [] arr = {12, 13, 2, 7, 9};
	
	// to find the sum of the digits in an array with index up to n 
	public static int SumofDigits(int n) {
		// base case 
		if (n == 0)
			return arr[n];
		// recursive structure 
		return arr[n] + SumofDigits(n-1);
				
	}
	// to find the factorial of a non-negative integer 
	public static int FactNum(int n) {
		// base case
		if (n == 0 || n == 1)
			return 1;
		// recursive structure 
		return n*FactNum(n-1);
	}
	
	// to find the Fibonacci number in the nth index in the sequence
	public static int Fib(int n) {
		// base case 
		if (n == 0 || n == 1)
			return n;
		return Fib(n-1) + Fib(n-2);
	}
	
	public static void main(String [] args) {
		int value = SumofDigits(arr.length-1);
		System.out.println(value);
		
		// Factorial 
		System.out.println(FactNum(5));
		System.out.println(FactNum(1));
		System.out.println(FactNum(0));
		
		
		// Fibonacci number
		System.out.println(Fib(0));
		System.out.println(Fib(1));
		System.out.println(Fib(5));
		System.out.println(Fib(9));
		System.out.println(Fib(19));
		
		
	}

} 


