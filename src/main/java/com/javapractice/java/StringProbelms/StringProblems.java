package com.javapractice.java.StringProbelms;

import java.util.List;

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
	
	//30. Write isHexNumber(String) method
	public boolean isHexNumber(String hex) {
		boolean isHex = true;
		String upperCaseHex = hex.toUpperCase();
		
		int i = 0;
		while (i < upperCaseHex.length() && isHex) {
			char currentChar = upperCaseHex.charAt(i);
			isHex = Character.isDigit(currentChar) || (currentChar >= 'A' && currentChar <= 'F');
			i++;
 		}
		return isHex;
	}
	
	//31. Write hexToDecimal(String)
	public int hexToDecimal(String hex) {
		if (!isHexNumber(hex))
			return -1;
		int decimal = 0, j = 0;
		for (int i = hex.length()-1; i>=0; i--) {
			int current = Character.getNumericValue(hex.charAt(i));
			decimal = decimal + current * (int) Math.pow(16, j);
			j++;
		}
		return decimal;
	}
	
	//32. Write method joinString(List<String>, String) which joins all string in the list with separator as second parameter
	public String joinStrings(List<String> strings, String connector) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<strings.size(); i++) {
			if (i == strings.size()-1)
				sb.append(strings.get(i));
			else
				sb.append(strings.get(i)).append(connector);
		}
		return sb.toString();
	}
}
