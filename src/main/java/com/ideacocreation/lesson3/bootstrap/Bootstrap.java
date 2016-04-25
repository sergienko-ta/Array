package com.ideacocreation.lesson3.bootstrap;

import com.ideacocreation.lesson3.my_interface.implementation.MyArrayClass;
import com.ideacocreation.lesson3.my_interface.implementation.MyArrayPrint;
import com.ideacocreation.lesson3.my_interface.implementation.MyArrayReverse;

/**
 * Main
 */
public final class Bootstrap {

    private static final Integer[] intARRAY = new Integer[] {1, 2, 3, 4, 5, 6, 7};

    /**
     * Default constructor
     */
    private Bootstrap(){

    }

    /**
     * Main
     * @param args incoming args
     */
    public static void main(final String [] args) {
        MyArrayClass<Integer> intArray = new MyArrayClass<>();
        intArray.setArray(intARRAY);

        MyArrayPrint arrayPrint = new MyArrayPrint();
        String outArray = arrayPrint.printArray(intArray);
        System.out.println(outArray);

        MyArrayReverse arrayReverse = new MyArrayReverse();
        arrayReverse.reverseArray(intArray);
        outArray = arrayPrint.printArray(intArray);
        System.out.println(outArray);
    }
}
