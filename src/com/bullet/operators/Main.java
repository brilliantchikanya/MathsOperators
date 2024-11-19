package com.bullet.operators;

import java.util.Random;

import static com.bullet.operators.UtilFunctions.printVariables;

/**
 * @author brilliant
 * @author com.bullet
 * @since 18-11-2024
 *
 * This class demonstrates the various mathematical operators in use.
 * Some of them include '+', '-', '*', '/', among others*/
public class Main {
    public static void main(String[] args) {
        // create a number generator
        Random generator = new Random(47);

        // integer number examples
        int x, y, z;    // declare three variables:
        x = generator.nextInt(100) + 1; // obtain an integer between 0 and 100
        y = generator.nextInt(100) + 1; // we offset by 1 since we will use division
        printVariables(x, y);
        int difference = x - y;
        System.out.println(difference);



        // floating point number examples

        //
    }





}
