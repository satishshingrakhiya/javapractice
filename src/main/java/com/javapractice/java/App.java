package com.javapractice.java;

import java.util.List;

import com.javapractice.java.MathProblems.MathProblems;

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
    }
}
