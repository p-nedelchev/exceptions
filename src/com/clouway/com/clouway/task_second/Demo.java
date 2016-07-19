package com.clouway.com.clouway.task_second;

import java.util.InputMismatchException;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {

        Reader reader = new Reader();
        double number = 0.0;
        try {
            number = reader.read( 69, 100 );
            System.out.println("Number is: " + number);
        } catch (NumberOutOfBoundException | InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
    }
}