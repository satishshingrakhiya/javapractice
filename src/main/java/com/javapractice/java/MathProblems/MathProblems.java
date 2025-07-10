package com.javapractice.java.MathProblems;

import java.util.LinkedList;
import java.util.List;

public class MathProblems {
	
	//implement multiplication of two numbers divide by two and the remainder of the result when divided by seven
	public int basicArithmeticOperation1(int num1, int num2) {
		int result = ((num1 * num2) / 2) % 7;
		return result;
	}
	
	//Find the number as well as the sum of natural numbers, which are divisible by 2 or 7 up to a given maximum value
	public String basicArithmeticOperation2(int num) {
		int sum = 0, count = 0;
		if (num >= 2) {
			for(int i=2; i<num; i++) {
				if (i % 2 == 0 || i % 7 == 0) {
					count++;
					sum+=i;
				}
			}
		}
		return "Count is: " + count + ". Sum is : " + sum + ".";
	}
	
	//Write method List<Integer> calcPerfectNumbers(int num) that calculates perfect number up to num value
	public List<Integer> calcPerfectNumbers(int num) {
		List<Integer> perfectNumbers = new LinkedList<>();
		for (int i=2; i<=num; i++) {
			int sum = 0;
			for (int j=1; j<=i/2; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				perfectNumbers.add(sum);
			}
		}
		return perfectNumbers;
	}
	
	//Write method List<Integer> calcPrimeNumbers(int num) that calculates prime number up to num value
	public List<Integer> calcPrimeNumbers(int num) {
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i=2; i<=num; i++) {
			boolean isPrime=true;
			for (int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

}
