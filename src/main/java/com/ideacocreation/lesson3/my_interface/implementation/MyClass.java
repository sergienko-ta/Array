package com.ideacocreation.lesson3.my_interface.implementation;

import com.ideacocreation.lesson3.my_interface.IMyInterface;

/**
 * Implementation of IMyInterface
 * @param <T>
 */

public class MyClass<T> implements IMyInterface<T> {

    private T val;
    /**
     * Default constructor
     */
    private MyClass() {
    }
    /**
     * Constructor with one int arg
     * @param value incoming int value
     */
    public MyClass(final T value) {
        val = value;
    }

 //   public void putValue(final T value) {
 //       val = value;
 //   }
    public T getValue() {
        return val;
    }

    public void setValue(final T value) {
        val = value;
    }


}
