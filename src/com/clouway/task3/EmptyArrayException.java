package com.clouway.task3;

/**
 * Created by clouway on 05.05.16.
 */
public class EmptyArrayException extends Exception {
  public EmptyArrayException() {
    super("array is empty");
  }
}
