package com.clouway.task3;

import java.util.List;

/**
 * Created by clouway on 05.05.16.
 */
public class Demo {
  public static void main(String[] args) throws Exception {
    ArrayOperation arrayOperation = new ArrayOperation(3);
    arrayOperation.addElement(23);
    arrayOperation.addElement(2);
    arrayOperation.addElement(3);
    //arrayOperation.addElement(3);
    System.out.println(arrayOperation.toString());
    arrayOperation.remove();
    System.out.println(arrayOperation.toString());
    arrayOperation.remove();
    System.out.println(arrayOperation.toString());
    arrayOperation.remove();
    System.out.println(arrayOperation.toString());
    // arrayOperation.remove();
    arrayOperation.addElement(323);
    System.out.println(arrayOperation.toString());
    arrayOperation.addElement(323);
    System.out.println(arrayOperation.toString());
    arrayOperation.addElement(231);
    System.out.println(arrayOperation.toString());
    String  elementsAsString = arrayOperation.toString();


  }

}
