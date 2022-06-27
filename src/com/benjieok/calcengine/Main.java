package com.benjieok.calcengine;

public class Main {

    public static void main(String[] args) {
        //this code performs operations based on the opCode selected

        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        char opCode = 'd';

        switch (opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                //conditional assignment  ->  condition ? true statement : false statement
                result = value2 != 0 ? value1 /value2 : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }

        System.out.println(result);
    }
}