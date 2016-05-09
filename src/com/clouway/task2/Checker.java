package com.clouway.task2;

import java.util.Scanner;


public class Checker {
  /**
   * checking of value whether is within range
   * @param low    the first range
   * @param high   the second range
   * @param number input value
   * @throws OutsideOfIntervalException
   */
  public void checking(int low, int high, int number) throws OutsideOfIntervalException {
    if (number < low || number > high) {

      throw new OutsideOfIntervalException();
    }
  }
}
