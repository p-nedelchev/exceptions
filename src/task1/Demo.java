package task1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws WrongValue {
        double result;
        Sumator math = new Sumator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter values: ");
        try{
        result = math.sum(scan.nextLine(), scan.nextLine());
        }catch (Exception e){
            throw new WrongValue("This is wrong data");
        }
        System.out.println(result);
    }
}

