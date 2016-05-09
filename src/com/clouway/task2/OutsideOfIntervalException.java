package com.clouway.task2;

public class OutsideOfIntervalException extends Exception {
   public OutsideOfIntervalException(){

      super("this element is outside interval ");
}
}
