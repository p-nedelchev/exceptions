package task2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class readAndCheckValue {
    // read a value from console and check if it is in range return true
    public boolean inputValue() throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        try {
            //enter value
            System.out.println("Enter value: ");
            a = scan.nextInt();
            //check the value
            if (a < 0 || a > 100) {
                throw new IOException("Value is out of range !");
            }
            return true;
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid value please !");
            inputValue();
        }
        return false;
    }

}
