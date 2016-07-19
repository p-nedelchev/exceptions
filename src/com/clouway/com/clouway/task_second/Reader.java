package com.clouway.com.clouway.task_second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Reader {

    private Scanner scan;

    public Reader() {
        scan = new Scanner(System.in);
    }

    /**
     * Reads a double number from the console in range [a,b]
     * @param a int lower bound
     * @param b int upper bounds
     * @return  double the read number from console else 0.0
     * @throws NumberOutOfBoundException occurs if number is lesser than a or greater than b
     */
    public double read(int a, int b) throws NumberOutOfBoundException, InputMismatchException {
        double value = 0.0;
        value = scan.nextDouble();
        if( value < a || value > b ) {
            throw new NumberOutOfBoundException("The number is not in [" + a +"," + b + "]");
        }
        return value;
    }
}