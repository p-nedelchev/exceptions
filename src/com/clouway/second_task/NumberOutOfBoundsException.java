package com.clouway.second_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class NumberOutOfBoundsException extends Exception {

    private static String message = "The number is out of bounds";

    public NumberOutOfBoundsException() {
        super(message);
    }

    public NumberOutOfBoundsException(String s) {
        super(s);
    }

}
