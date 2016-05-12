package task2.rangeexception;

import java.util.Scanner;

/**
 * Created by clouway on 04.05.16.
 */
public class Demo {
    public static void main(String[] args) throws RangeException {
        Scanner scanner = new Scanner(System.in);
        int z;
        z = scanner.nextInt();
        Range range = new Range(0,100);
        range.checkInput(z);

    }
}
