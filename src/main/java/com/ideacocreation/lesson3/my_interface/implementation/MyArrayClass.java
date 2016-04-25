package com.ideacocreation.lesson3.my_interface.implementation;

import com.ideacocreation.lesson3.my_interface.IArrayInterface;

/**
 * My Interface
 * @param <T> type
 */
public class MyArrayClass<T> implements IArrayInterface<T> {


    private T[] array;

    /**
     * Default constructor
     */
    public MyArrayClass() {
    }

    /**
     * Setter
     * @param newArray incoming array
     */
    public void setArray(final T[] newArray) {
        this.array = newArray;
   }

    /**
     * Getter
     * @return array
     */
    public T[] getArray() {
        return this.array;
    }
}