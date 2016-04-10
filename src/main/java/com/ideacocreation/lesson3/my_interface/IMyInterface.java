package com.ideacocreation.lesson3.my_interface;

/**
 * Interface for provide contract with specific object
 * @param <T>
 */

public interface IMyInterface <T> {
    /**
     * Getter
     * @return return value
     */
    T getValue();

    /**
     * Setter
     * @param value incoming arg
     */
    void setValue(final T value);
}
