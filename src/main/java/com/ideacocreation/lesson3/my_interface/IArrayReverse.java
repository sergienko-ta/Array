package com.ideacocreation.lesson3.my_interface;

import com.ideacocreation.lesson3.my_interface.implementation.MyArrayClass;

/**
 * Interface for reverse array
 */
public interface IArrayReverse {

    /**
     * Array reverse
     * @param array incoming param
     * @param <T> type
     */
    <T>  void reverseArray(final MyArrayClass<T> array);
}
