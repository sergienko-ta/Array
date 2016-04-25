package com.ideacocreation.lesson3.my_interface.implementation;

import com.ideacocreation.lesson3.my_interface.IArrayPrint;

/**
 * Print array
 */
public class MyArrayPrint implements IArrayPrint {

    /**
     * Print Array
     *
     * @param array incoming param
     * @param <T>   template
     * @return Array to String out
     */
    public <T> String printArray(final MyArrayClass<T> array) {
        String stringOut = "";
        for (T element : array.getArray()) {
            stringOut = stringOut + element;
            stringOut = stringOut + ' ';
        }
        return stringOut;
    }
}
