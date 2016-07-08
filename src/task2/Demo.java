package task2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Value value = new Value();
        Scanner scan = new Scanner(System.in);
        try {
            value.inputValue(scan.nextInt());
        } catch (Exception e) {
            throw new OutOfRangeException("Wrong Value");
        }

    }
}

