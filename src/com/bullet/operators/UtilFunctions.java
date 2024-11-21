package com.bullet.operators;

/**
 * @author brilliant
 * @author com.bullet
 * @since 18-11-2024*/

public class UtilFunctions<T extends Number> {
    private T x;
    private T y;

    public UtilFunctions(T x, T y) {
        this.x = x;
        this.y = y;
    }

    // this method presents formatted int variables and their values
    void printVariables(T x, T y) {
        print(x, y);
    }
    void print(T x, T y) {
        System.out.println("*************************************");
        System.out.print(" variable     | ");
        System.out.print("   x   |  ");
        System.out.println("   y    |");
        System.out.print(" value        |  ");
        System.out.print("  " + x + "  |   ");
        System.out.println("  " + y + "   |");
        System.out.println("*************************************");
    }

    public Integer add(Integer x, Integer y) {
        /*Integer result = 0;
        result = x + y;
        return result;*/
        return x + y;
    }
}
