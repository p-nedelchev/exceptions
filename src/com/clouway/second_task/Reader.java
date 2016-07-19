package com.clouway.second_task;

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
     * @throws NumberOutOfBoundsException occurs if number is lesser than a or greater than b
     */
    public double read(int a, int b) throws NumberOutOfBoundsException, InputMismatchException {
        double value = 0.0;
        value = scan.nextDouble();
        if( value < a || value > b ) {
            throw new NumberOutOfBoundsException("The number is not in [" + a +"," + b + "]");
        }
        return value;
    }
}
