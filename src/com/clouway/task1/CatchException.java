package com.clouway.task1;

public class CatchException {
  /**
   * summation of two string
   * @param a the first string to sum
   * @param b the second string to sum
   * @throws NumberFormatException
   * @return the sum of the specified numbers
   */
  public String sum(String a, String b) {
    String result;
    try {
      int a1 = Integer.parseInt(a) + Integer.parseInt(b);
      String sum = Integer.toString(a1);
      return sum;


    } catch (NumberFormatException ex) {
      //when a or b is not a number
      result = "Invalid input";


    }
    return result;

  }
}
