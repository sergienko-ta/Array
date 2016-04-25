package com.ideacocreation.lesson3.my_interface;

/**
 * Interface for provide contract with specific object
 * @param <T>
 */

public interface IArrayInterface<T> {
    /**
     * Getter
     * @return return value
     */
    T[] getArray();

    /**
     * Setter
     * @param array incoming arg
     */
    void setArray(final T[] array);
}
