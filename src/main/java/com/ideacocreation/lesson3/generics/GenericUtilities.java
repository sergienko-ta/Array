package com.ideacocreation.lesson3.generics;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.List;

/**
 * Generic for method
 */
public final class GenericUtilities {

    /**
     * Default constructor
     */
    private GenericUtilities(){
        }

    /**
     * Fill list
     * @param array list of T object
     //* @param val element for list filling
     * @param <T> list/element type
     */

    /**
     * Reverse Array
     * @param array array of T object
     * @param <T> array/element type
     */
    public static <T>void reverseArray(final ArrayList<T> array) {
        for (int i = 0; i < array.size() / 2; i++) {
            T getValueA = array.get(i);
            T getValueB = array.get(array.size() - i - 1);

            array.set(i, getValueB);
            array.set(array.size() - i - 1, getValueA);
        }


    }

    /**
     * Print array
     * @param array incoming arg
     */
    public static void printArray(final ArrayList<?> array) {
        for (Object l : array) {
            System.out.print(" " + l + " ");
        }
    }



 /*   public static <T> void fill(final List<T> list, final T val) {
        for (int i = 0; i < list.size(); i++){
            list.set(i, val);
        }
    }

    /**
     * Print list. Using wildcards
     * @param list incoming list
     */
  /*  public static void printList(final List<?> list) {
        for (Object l:list) {
            System.out.println("(" + l + ")");
        }
    } */
}
