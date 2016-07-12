package task1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        double result = 0;
        Scanner scan = new Scanner(System.in);
        Sumator math = new Sumator();
        boolean done = false;
        do{
            try {
                System.out.println("Enter values: ");
                result = math.sum(scan.nextLine(), scan.nextLine());
                done=true;
            }catch (InputDataException ex){
                ex.printStackTrace();// we put some message here !
            }
        }while (!done);
        System.out.println(result);
    }
}


