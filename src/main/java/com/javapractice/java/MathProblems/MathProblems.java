package com.javapractice.java.MathProblems;

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

}
