package task2.inputscanner;

import java.util.Scanner;

/**
 * Created by clouway on 19.04.16.
 */
public class DemoInput {
  public static void main(String[] args) throws NumberOutOfBoundsException {
    Scanner sc=new Scanner(System.in);
    InputScanner test=new InputScanner();
    int a;
    while (sc.hasNext()){
      a=sc.nextInt();
      test.checkInput(a);
    }
  }
}
