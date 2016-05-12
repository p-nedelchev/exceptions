package task2.rangeexception;

import java.util.Scanner;

/**
 * Created by clouway on 04.05.16.
 */
public class Demo {
    public static void main(String[] args) throws RangeException {
        Scanner scanner = new Scanner(System.in);
        task2.rangeexception.Range checker = new task2.rangeexception.Range();
        int a;
        while (scanner.hasNext()) {
            a = scanner.nextInt();
            checker.checkInput(a, 0, 100);
        }
    }
}
