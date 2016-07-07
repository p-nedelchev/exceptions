package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sumator {
    public double sum() {
        //read two numbers from console and return the result
        Scanner scan = new Scanner(System.in);
        double a = 0, b = 0;
        try { // try to enter a valid value
            System.out.println("Enter a= ");
            a = scan.nextDouble();
            System.out.println("Enter b= ");
            b = scan.nextDouble();
        } catch (InputMismatchException e) {
            // if numbers are not valid return a message and it get back until we enter a valid value
            System.out.println("Enter a valid number!");
            sum();

        }
        return a + b;
    }
}
