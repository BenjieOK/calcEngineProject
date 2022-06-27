package com.benjieok.calcengine;

public class Array {

    public static void main(String[] args) {

        float[] vals = new float[3];
       vals[0] = 1.0f;
       vals[1] = 2.0f;
       vals[2] = 3.0f;
        float result = 0.0f;
        int i;

        for ( i = 0; i < vals.length; i++){
            result += vals[i];
        }
        System.out.println(result);
    }
}
