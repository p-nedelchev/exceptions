package com.clouway.com.clouway.task_second;

import java.util.InputMismatchException;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Reader reader = new Reader();
        double number = 0.0;
        number = reader.read( 69, 569);
        System.out.println("Number is: " + number);
    }
}