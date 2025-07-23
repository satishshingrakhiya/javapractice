package com.javapractice.java.StringProbelms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	//33. Write reverseString method
	public String reverseString(String str) {
		String result = "";
		for (char c: str.toCharArray()) {
			result = c + result;
		}
		return result;
	}
	
	public String reverseString2(String str) {
		char[] chars = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		
		while (left < right) {
			char leftChar = chars[left];
			char rightChar = chars[right];
			
			chars[left] = rightChar;
			chars[right] = leftChar;
			
			left++;
			right--;
		}
		return String.valueOf(chars);
	}
	
	// 34. Write method to check if String is palindrome
	public boolean isPalindrome(String str) {
		char[] chars = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		
		while (left < right) {
			if (chars[left] != chars[right])
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	//35. Implement checkNoDuplicates method
	public boolean checkNoDuplicates(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		
		Set<Character> containedChars = new HashSet<>();
		for (char c: chars) {
			if (containedChars.contains(c))
				return false;
			containedChars.add(c);
		}
		return true;
	}
	
	//36. Implement removeDuplicates
	public String removeDuplicates(String str) {
		
		List<Character> chars = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (char c: str.toLowerCase().toCharArray()) {
			if (chars.contains(c))
				continue;
			chars.add(c);
			sb.append(c);
		}
		return sb.toString();
	}
}
