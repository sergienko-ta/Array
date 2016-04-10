package com.ideacocreation.lesson3.generics;

/**
 * Generic class
 * @param <T> type
 */
public class MyGeneric<T> {
    private T val;

    /**
     * Constructor
     * @param arg incoming arg
     */
    public MyGeneric(final T arg){
        val = arg;
    }

    /**
     * Represent class to string
     * @return string value
     */
    public String toString() {
        return "(" + val + ")";
    }

    /**
     * Getter
     * @return T
     */
    public T getValue() {
        return val;
    }
}
