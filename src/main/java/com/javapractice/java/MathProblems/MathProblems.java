package com.javapractice.java.MathProblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	
	//Compute all pairs of prime numbers with a distance  of 2 (twin), 4 (Cousin), and 6 (sexy) up to a given number n.
	public List<Map<Integer, Integer>> primePairs(int num) {
		List<Integer> primeNumbers = calcPrimeNumbers(num);
		Map<Integer, Integer> twin = new HashMap<>();
		Map<Integer, Integer> cousin = new HashMap<>();
		Map<Integer, Integer> sexy = new HashMap<>();
		
		for (int i: primeNumbers) {
			if (primeNumbers.contains(i+2)) {
				twin.put(i,	i+2);
			}
			if (primeNumbers.contains(i+4)) {
				cousin.put(i, i+4);
			}
			if (primeNumbers.contains(i+6)) {
				sexy.put(i, i+6);
			}
		}
		
		List<Map<Integer, Integer>> primePairsList = new LinkedList<>();
		primePairsList.add(twin);
		primePairsList.add(cousin);
		primePairsList.add(sexy);
		
		return primePairsList;
	}
	
	//Create method int calcChecksum(String) that performs the following position based calculation for the checksum of any number of length given as string
	// z1z2z3...zn => (1*z1 + 2*z2 + 3*z3 + ... + n*zn) % 10
	public int calcCheckSum(String num) {
		int num1 = Integer.parseInt(num);
		int checkSum = 0;
		int length = num.length();
		while (num1 > 0) {
			checkSum += (num1 % 10) * length;
			num1 = num1/10;
			length--;
		}
		return checkSum % 10;
	}

}