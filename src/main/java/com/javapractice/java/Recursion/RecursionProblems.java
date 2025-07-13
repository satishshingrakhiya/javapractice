package com.javapractice.java.Recursion;

import java.util.LinkedList;
import java.util.List;

public class RecursionProblems {
	
	//12. Implement Fibonacci series till number n
	public List<Integer> fibonacciSeries(int n) {
		List<Integer> result = new LinkedList<>();
		for (int i=1; i<=n; i++) {
			result.add(fibonacciNumber(i));
		}
		return result;
	}
	
	public int fibonacciNumber(int n) {
		if (n==1 || n==2)
			return 1;
		return fibonacciNumber(n-1) + fibonacciNumber(n-2);
	}
	
	//13. Implement Fibonacci Series with iterative method
	public List<Integer> fibSeriesIterative(int n){
		List<Integer> result = new LinkedList<>();
		result.add(1);
		result.add(1);
		for (int i=2; i<n; i++) 
		result.add(result.get(i-2) + result.get(i-1));
		return result;
	}
	
	//14. Write recursive method to find number of digits in a positive natural number
	public int countDigits(int num) {
		if (num < 10)
			return 1;
		int remainder = num/10;
		return countDigits(remainder) + 1;
	}
	
	//15. Write recursive method to find sum of digits of a number
	public int sumOfDigits(int num) {
		if (num < 10)
			return num;
		int sum = num % 10;
		return sumOfDigits(num/10) + sum;
	}
	
	//16. Write GCD recursive gcd(int a, int b) 
	public int gcd(int a, int b) {
		if (b > a) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
}
