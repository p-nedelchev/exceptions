package com.clouway.first_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Sumator {


    /**
     * Parses the content of two numeric strings and calculates their sum
     * @param a String first numeric string
     * @param b String second numeric string
     * @return Integer the sum of a and b
     */
    public Double sum(String a, String b) {
        double sum = 0.0;
        try{
           sum =Double.parseDouble(a) + Double.parseDouble(b);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }
}
