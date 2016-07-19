package com.clouway.third_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class FullListException extends RuntimeException {

    private static String message = "List is full";

    public FullListException() {
        super(message);
    }

    public FullListException(String message) {
        super(message);
    }
}
