package com.benjieok.calcengine;

public class WhileLoop {

    public static void main(String[] args) {
        /*
         * What is factorial?
         * The product of all positive integers less than or equal to a given positive integer.
         * Thus, factorial seven is written 7!, meaning 1 × 2 × 3 × 4 × 5 × 6 × 7.
         * Factorial zero is defined as equal to 1.
         */

        //finding the factorial of 5
        int someValue = 5;
        int factorial = 1;

        while(someValue > 1) {
            factorial *= someValue; //also written as ->  factorial = factorial * someValue;
            someValue--;
        }

        System.out.println(factorial);
    }

}
