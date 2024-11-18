package com.bullet.operators;

import java.util.Random;

import static com.bullet.operators.Functions.printVariables;

/**
 * This class demonstrates */
public class Main {
    public static void main(String[] args) {
        Random generator = new Random(47);

        // integer number examples
        int x = generator.nextInt(100) + 1;
        //System.out.println(x);
        int y = generator.nextInt(100) + 1;
        //System.out.println(y);
        printVariables(x, y);
        int difference = x - y;
        System.out.println(difference);



        // floating point number examples

        //
    }

    private void add(int x, int y) {

    }



}
