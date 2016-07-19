package com.clouway.third_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class EmptyListException extends RuntimeException {

    private static String message = "Empty list";

    public EmptyListException() {
        super(message);
    }

    public EmptyListException(String message) {
        super(message);
    }
}
