package com.clouway.task3;

/**
 * Created by clouway on 05.05.16.
 */
public class Demo {
  public static void main(String[] args) throws Exception {
    Array array = new Array(3);
    array.addElement(23);
    array.addElement(2);
    array.addElement(3);
    //array.addElement(3);
    System.out.println(array.toString());
    array.remove();
    System.out.println(array.toString());
    array.remove();
    System.out.println(array.toString());
    array.remove();
    System.out.println(array.toString());
    // array.remove();
    array.addElement(323);
    System.out.println(array.toString());
    array.addElement(323);
    System.out.println(array.toString());
    array.addElement(231);
    System.out.println(array.toString());
    String  elementsAsString = array.toString();


  }

}
