package com.javapractice.java.StringProbelms;

public class StringProblems {
	
	//28. Write isBinaryNumber(String) method
	public boolean isBinaryNumber(String str) {
		for (char c: str.toCharArray()) {
			if (c == '0' || c == '1');
			else
				return false;
		}
		return true;
	}
	
	//29. Write method binaryTDecimal(String) 
	public int binaryToDecimal(String binary) {
		if (!isBinaryNumber(binary))
			return -1;
		int decimal = 0, j=0;
		for (int i = binary.length()-1; i>=0; i--) {
			int current = binary.charAt(i) - '0';
			decimal = decimal + current * (int) Math.pow(2, j);
			j++;
		}
		
		return decimal;
	}
}
