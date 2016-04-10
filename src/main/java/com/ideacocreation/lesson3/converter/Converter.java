package com.ideacocreation.lesson3.converter;

import com.ideacocreation.lesson3.my_interface.IMyInterface;

/**
 * Util class
 */
public class Converter {

    /**
     * Convert incoming MyClass to String
     * @param myClass implementation of MyClass
     * @return return string value of MyClass
     */

    public String convertToStr(final IMyInterface myClass) {
        return myClass.getValue().toString();
    }
}
