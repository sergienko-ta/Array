package com.ideacocreation.lesson3.exceptions;

/**
 * MyException class
 */
public class MyException extends Exception {
    /**
     * Constructor
     * @param e incoming param
     */
    public MyException(final Throwable e) {
        initCause(e);
    }
}
