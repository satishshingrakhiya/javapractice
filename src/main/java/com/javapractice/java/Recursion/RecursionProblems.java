package com.javapractice.java.Recursion;

import java.util.Arrays;
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
	
	//17. Write GCD iterative
	public int gcdIterative(int a, int b) {
		if (b > a) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		
		if (b == 0)
			return a;
		
		for (int i=b; i>0; i--) {
			if (a % i == 0 && b % i == 0)
				return i;
		}
		return 1;
	}
	
	//18. Write LCD  method
	public int lcm(int a, int b) {
		return a * b /gcd(a, b);
	}
	
	//19. Write recursive method String reverseString(String str)
	public String reverseString(String str) {
		if (str.length() <= 1)
			return str;
		String reverse = str.substring(str.length()-1);
		return reverse + reverseString(str.substring(0, str.length()-1));
	}
	
	//20. Write method sum(int arr[]) that recursively computes the sum of the values of the given array
	public int sum(int arr[]) {
		if (arr.length == 1)
			return arr[0];
		int total = arr[0];
		return total + sum(Arrays.copyOfRange(arr, 1, arr.length));
	}
	
	//21. Write method int min(int arr[]) using recursion
	private int min(int arr[], int pos, int currentMin) {
		
		if(pos >= arr.length)
			return currentMin;
		
		int current = arr[pos];
		if (current < currentMin)
			currentMin = current;
		
		return min(arr, pos + 1, currentMin);		
	}
	
	public int min(int arr[]) {
		return min(arr, 0, Integer.MAX_VALUE);
	}
	
	//22. Write method String toBinary(int num)
	public String toBinary(int num) {
		if (num == 1)
			return "1";
		if (num == 0)
			return "0";
		int remainder = num % 2;
		String binary = String.valueOf(remainder);
		return toBinary(num/2) + binary;
	}
	
	//23. Write method String toOctal(int num) and toHex(int num)
	public String toOctal(int num) {
		if (num < 8)
			return String.valueOf(num);
		
		int remainder = num % 8;
		String octal = String.valueOf(remainder);
		
		return toOctal(num/8) + octal;
	}
	
	private String asHexDigit(int n) {
		if (n < 10)
			return String.valueOf(n);
		if (n <= 15)
			return Character.toString(n - 10 + 'A');
		throw new IllegalArgumentException("value not in range 0-15, but is: " + n);
	}
	
	public String toHex(int num) {
		if (num <= 15)
			return asHexDigit(num);
		
		int remainder = num % 16;
		String hex = asHexDigit(remainder);
		
		return toHex(num/16) + hex;
	}
	//24. Write recursive method boolean isPowerOf2(int num) that evaluates the given positive integer to see if it is power of two
	public boolean isPowerof2(int num) {
		if(num < 2)
			return num==1;
		
		if (num % 2 != 0)
			return false;
		
		return isPowerof2(num/2);
	}
	
	//25. Write recursive method long powerOf(int base, int exp)
	public long powerOf(int base, int exp) {
		if (exp == 0)
			return 1;
		if (exp == 1)
			return base;
		return base * powerOf(base, exp-1);
	}
	
	//26. Implement pascal's triangle
//	private int calPascal(int row, int col) {		
//		if (col == 1  ||  col == row)
//			return 1;
//		else
//			return calPascal(row - 1, col - 1) + calPascal(row - 1, col);
//	}
//	
//	public void printPascal(int num) {
//		for (int row=1; row<=num; row++) {
//			for (int col=1; col<=num; col++)
//				System.out.print(calPascal(row, col));
//			
//			System.out.println();
//		}
//	}
	
	//27. Check for a number if it is palindrome without using string
	public boolean isNumberPalindrome(int num) {
		if (num < 10)
			return true;
		
		int factor = calcPowOfTen(num);
		int divisor = (int) Math.pow(10, factor);
		
		if (num < divisor * 10) {
			int leftNumber = num/divisor;
			int rightNumber = num % 10;
			
			int remainingNumber = (num / 10) % (divisor / 100);
			System.out.println("Number: " + num + " Remaining Number: " +remainingNumber + " Divisor: " + divisor);
			if (leftNumber != rightNumber)
				return false;
			else
				return isNumberPalindrome(remainingNumber);
		}
		return false;
	}
	
	private int calcPowOfTen(int num) {
		return countDigits2(num) - 1;		
	}
	
	private int countDigits2(int num) {
		int count = 1;
		while (num > 0) {
			num = num/10;
			count++;
		}
		return count;
	}
}


