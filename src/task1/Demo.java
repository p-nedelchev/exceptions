package task1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws MyException {
        Sumator math = new Sumator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter values : ");
        System.out.println(math.sum(scan.nextLine(), scan.nextLine()));
    }
}

