package com.benjieok.calcengine;

public class Main {

    public static void main(String[] args) {
        //this code performs operations based on the opCode selected

        double[] leftVals = {10.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d','a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++){
        switch (opCodes[i]) {
            case 'a':
                results[i] = leftVals[i] + rightVals[i];
                break;
            case 's':
                results[i] = leftVals[i] - rightVals[i];
                break;
            case 'm':
                results[i] = leftVals[i] * rightVals[i];
                break;
            case 'd':
                //conditional assignment  ->  condition ? true statement : false statement
                results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                break;
            default:
                System.out.println("invalid opCode: " + opCodes[i]);
                results[i] = 0.0d;
                break;
            }
        }
        for (double currentResult : results)
        System.out.println(currentResult);
    }
}