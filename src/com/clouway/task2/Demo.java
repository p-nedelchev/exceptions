package com.clouway.task2;
public class Demo {
  public static void main(String[] args) throws OutsideOfIntervalException {
    Checker i = new Checker();
    i.checking(100, 300,200);
    System.out.println("this element is inside interval");

  }
}
