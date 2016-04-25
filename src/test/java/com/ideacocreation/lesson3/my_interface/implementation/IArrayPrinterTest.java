package com.ideacocreation.lesson3.my_interface.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tatyana on 24.04.16.
 */
public class IArrayPrinterTest {

    private MyArrayClass<Integer> arrayPrinter;
    private static final Integer[] printARRAY = new Integer[]{1, 2, 3};




    @Test
    public void testPrinter() {
        MyArrayClass<Integer> arrayPrinter = new MyArrayClass<>();
        arrayPrinter.setArray(printARRAY);

        MyArrayPrint arrayPrint = new MyArrayPrint();
        String outPrint = arrayPrint.printArray(arrayPrinter);
        //System.out.println(outPrint);
        assertEquals("1 2 3 ", outPrint);
    }

}
