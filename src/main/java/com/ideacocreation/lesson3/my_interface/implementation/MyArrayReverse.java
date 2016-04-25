package com.ideacocreation.lesson3.my_interface.implementation;

import com.ideacocreation.lesson3.my_interface.IArrayReverse;

/**
 * Array reverse
 */
public class MyArrayReverse implements IArrayReverse {
    /**
     * Array reverse
     * @param array incoming param
     * @param <T> type
     */
    public <T> void reverseArray(final MyArrayClass<T> array) {
        T[] tempArray = array.getArray();
        int length = tempArray.length;

        for (int i = 0; i < length / 2; i++) {
            T intermediateValue = tempArray[i];
            tempArray[i] = tempArray[length - i - 1];
            tempArray[length - i - 1] = intermediateValue;
        }
        array.setArray(tempArray);
    }
}
