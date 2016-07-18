package com.clouway.first_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Sumator {


    /**
     * Parses the content of rwo numeric strings and calculates their sum
     * @param a String first numeric string
     * @param b String second numeric string
     * @return Integer the sum of a and b
     */
    public Integer sum(String a, String b) {
        int sum = 0;
        try{
           sum =Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }
}
