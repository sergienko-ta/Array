package com.ideacocreation.lesson3.my_interface.implementation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Testing Reverse
 */
public class IArrayReverseTest {

    private MyArrayClass<Integer> reverser;

    private static final Integer[] startARRAY = new Integer[]{1, 2, 3};
    private static final Integer[] finishARRAY = new Integer[]{3, 2, 1};


    /*    @Before
        public void setUp() {
            this.reverser = new MyArrayClass<>();
        } */

    @Test
    public void testReverse() {
        MyArrayClass<Integer> original = new MyArrayClass<>();
        original.setArray(startARRAY);

        MyArrayReverse arrayReverse = new MyArrayReverse();
        arrayReverse.reverseArray(original);

        Integer[] reverser = original.getArray();

        assertArrayEquals("wrong reverse",reverser,finishARRAY);
    }
}
