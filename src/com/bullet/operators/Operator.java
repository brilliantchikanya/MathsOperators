package com.bullet.operators;


/**
 * @author brilliant
 * @author com.bullet
 * @since 18-11-2024
 * */

// This object creates operators, with each operator having its precedence
public enum Operator {
    EQUALS(0),
    SUBTRACT(1),
    ADD(2),
    DIVIDE(3),
    MULTIPLY(4);

    private int precedence;

    Operator(int precedence) {
        this.precedence = precedence;
    }

    int getPrecedence() {
        return precedence;
    }


}




