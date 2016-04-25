package com.ideacocreation.lesson3.my_interface;

import com.ideacocreation.lesson3.my_interface.implementation.MyArrayClass;

/**
 * Interface for Array printer
 */

public interface IArrayPrint {

    /**
     * Array print
     * @param array incoming param
     * @param <T> type
     */
    <T> String printArray(final MyArrayClass<T> array);
}
