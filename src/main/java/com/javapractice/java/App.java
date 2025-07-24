package com.javapractice.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.javapractice.java.MathProblems.MathProblems;
import com.javapractice.java.Recursion.RecursionProblems;
import com.javapractice.java.StringProbelms.StringProblems;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MathProblems mp = new MathProblems();
        
        System.out.println(mp.basicArithmeticOperation1(6, 7));
        System.out.println(mp.basicArithmeticOperation1(3, 4));
        System.out.println(mp.basicArithmeticOperation1(5, 5));
       
        System.out.println(mp.basicArithmeticOperation2(3));
        System.out.println(mp.basicArithmeticOperation2(8));
        System.out.println(mp.basicArithmeticOperation2(15));
        
        List<Integer> perfectNumbers = mp.calcPerfectNumbers(10000);
        System.out.print("Perfect Numbers: ");
        for (int i: perfectNumbers) {
        	System.out.print(i + " ");
        }
        
        List<Integer> primeNumbers = mp.calcPrimeNumbers(100);
        System.out.print("Prime Numbers: ");
        for (int i: primeNumbers) {
        	System.out.print(i + " ");
        }
        System.out.println();
        
        List<Map<Integer,Integer>> primePairs = mp.primePairs(100);
        for (Map map: primePairs) {
        	System.out.println(map);
        }
        
        System.out.println(mp.calcCheckSum("11111"));
        System.out.println(mp.calcCheckSum("87654321"));
        
        System.out.println(mp.romanToNumber("MCMLXXI"));
        System.out.println(mp.romanToNumber("cdxliv"));
        
        List<String> pyTriplets = mp.pythagorasTriplets(100);
        for(String str: pyTriplets) {
        	System.out.println(str);
        }
        
        List<Integer> arms = mp.caclArmstrongNumbers();
        for (int i: arms) {
        	System.out.println("Armstrong Number: " + i);
        }
        
        System.out.println(mp.basicArithmeticOperation10(2000));
        
        List<Integer> primes = mp.caclPrimeFactors(73548);
        for (int i: primes)
        	System.out.print(i + " "); 
        System.out.println();
        
        
        RecursionProblems rp = new RecursionProblems();
        
        List<Integer> fibSeries = rp.fibonacciSeries(8);
        System.out.print("Fibonacci Series: ");
        for (int i: fibSeries)
        	System.out.print(i + " "); 
        
        List<Integer> fibIterativeSeries = rp.fibSeriesIterative(8);
        System.out.print("Fibonacci Series with Iterative Method: ");
        for (int i: fibIterativeSeries)
        	System.out.print(i + " ");
        
        System.out.println();
        System.out.println("Count of digits: " + rp.countDigits(864856438));
        System.out.println("Sum of digits: " + rp.sumOfDigits(4526756));
        System.out.println("GCD of 84 & 56: " + rp.gcd(84, 56));
        System.out.println("GCD by iterative method of 100 & 60: " + rp.gcdIterative(100, 60));
        System.out.println("LCM of 8 & 6 is: " + rp.lcm(8, 6));
        System.out.println("Revers String of 'qwertyuiop' is: " + rp.reverseString("qwertyuiop"));
        
        int arr[] = {8, 3, 5, 1, 6};
        System.out.println("Sum of array [8, 3, 5, 1, 6]: " + rp.sum(arr));
        System.out.println("Min from array: " + rp.min(arr));
        
        System.out.println("Binary of 250 is: " + rp.toBinary(250));
        System.out.println("Ocatal of 250 is: " + rp.toOctal(250));
        System.out.println("Hexadecimal of 250 is: " + rp.toHex(250));
        
        System.out.println("1024 is powwer of 2: " + rp.isPowerof2(1024));
        System.out.println("1000 is powwer of 2: " + rp.isPowerof2(1000));
        
        System.out.println("2 to the power of 10: " + rp.powerOf(2, 10));
        System.out.println("4 to the power of 4: " + rp.powerOf(4, 4));
        
        // rp.printPascal(6);
        System.out.println("10201 is Palindrome? " + rp.isNumberPalindrome(13231));
        System.out.println("1062201 is Palindrome? " + rp.isNumberPalindrome(1062201));
        
        StringProblems sp = new StringProblems();
        System.out.println(sp.isBinaryNumber("110111"));
        System.out.println(sp.binaryToDecimal("110111"));
        
        System.out.println(sp.isHexNumber("AFDB12"));
        System.out.println(sp.hexToDecimal("AFDB12"));
        
        List<String> strs = Arrays.asList("Hello", "World", "Example", "33", "!!!!");
        System.out.println(sp.joinStrings(strs, " +++ "));
        
        System.out.println(sp.reverseString("Reverse This"));
        System.out.println(sp.reverseString2("Reverse This"));
        
        System.out.println(sp.isPalindrome("ISISISISI"));
        System.out.println(sp.isPalindrome("ISISISISIS"));
        
        System.out.println(sp.checkNoDuplicates("hnksdfbignkibfir"));
        System.out.println(sp.checkNoDuplicates("qwertyuiopasdfghjklzxcvbnm"));
        
        System.out.println(sp.removeDuplicates("Satish"));
        
        System.out.println(sp.capitalize("this is an example string which needs to be capitalized."));
        
        System.out.println(sp.isSubstringRotation("Challenge", "GECHT"));
        System.out.println(sp.isSubstringRotation("Challenge", "GECHall"));
    }    
}
