package com.ideacocreation.lesson3.generics;

/**
 * Generic class with two T
 * @param <T1> T1.obj
 * @param <T2> T2.obj
 */
public class MyComplexGeneric<T1, T2> {
    /**
     * T1 object
     */
    private T1 object1;
    /**
     * T2 object
     */
    private T2 object2;

    /**
     * Constructor with 2 arg
     * @param one object
     * @param two object
     */
    public MyComplexGeneric(final T1 one, final T2 two){
        object1 = one;
        object2 = two;
    }

    /**
     * Getter for first object
     * @return first object
     */
    public T1 getFirst (){
        return object1;
    }

    /**
     * Getter for second object
     * @return second object
     */
    public T2 getSecond () {
        return object2;
    }
}
