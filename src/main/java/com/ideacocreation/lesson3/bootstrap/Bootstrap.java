package com.ideacocreation.lesson3.bootstrap;


import com.ideacocreation.lesson3.exceptions.MyException;
import com.ideacocreation.lesson3.generics.GenericUtilities;
import com.ideacocreation.lesson3.my_interface.implementation.MyClass;

import java.util.ArrayList;

/**
 * Main
 */
public final class Bootstrap {

    /** int value */
    private static final Integer VALUE1 = 12;
    /** another int value */
    private static final Integer VALUE2 = 10;
    /** int value */
    private static final Integer VALUE3 = 7;
    /** another string value */
    private static final String STR_VALUE = "str";

    /**
     * Default constructor
     */
    private Bootstrap(){

    }

    /**
     * Main
     * @param arg incoming arg
     * @throws MyException exception
     */
    public static void main(final String [] arg) throws MyException {

        //Interface using example
        MyClass<Integer> itemInt = new MyClass<Integer>(VALUE1);
        MyClass<String> itemStr = new MyClass<String>(STR_VALUE);

        System.out.println(itemInt.getValue());
        System.out.println(itemStr.getValue());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(itemInt.getValue());
        intList.add(VALUE2);
        intList.add(VALUE3);
        intList.add(VALUE1);
        intList.add(VALUE3);

        System.out.println("Array before the reverse: ");
        GenericUtilities.printArray(intList);

        GenericUtilities.reverseArray(intList);
        System.out.println(" ");
        System.out.println("Array after the reverse: ");
        GenericUtilities.printArray(intList);
        System.out.println(" ");

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Jan");
        strList.add("Feb");
        strList.add("Mar");
        strList.add("Apr");

        System.out.println("Array before the reverse: ");
        GenericUtilities.printArray(strList);


        GenericUtilities.reverseArray(strList);
        System.out.println(" ");
        System.out.println("Array after the reverse: ");
        GenericUtilities.printArray(strList);
        System.out.println(" ");

    }

 /*         int result1 = 0;
          try {
              result1 = getAreaValue(-1, VALUE2 * VALUE2);
              System.out.println(result1);
          }
          catch (IllegalArgumentException e) {
              throw new MyException(e);
          }

      }

    private static int getAreaValue(final int x, final int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("value of 'x' or 'y' is negative: x=" + x + ", y =" + y);
        }
        return x * y;
    }
    */
}
