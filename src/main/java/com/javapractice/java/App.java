package com.javapractice.java;

import java.util.List;
import java.util.Map;

import com.javapractice.java.MathProblems.MathProblems;
import com.javapractice.java.Recursion.RecursionProblems;

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
    }    
}
