package com.javapractice.java.Recursion;

import java.util.LinkedList;
import java.util.List;

public class RecursionProblems {
	
	//1. Implement Fibonacci series till number n
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
}
