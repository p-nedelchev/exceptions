package com.clouway.com.clouway.task_second;


/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class NumberOutOfBoundException extends RuntimeException {

    private static String message = "The number is out of bounds";

    public NumberOutOfBoundException() {
        super(message);
    }

    public NumberOutOfBoundException(String message) {
        super(message);
    }

}