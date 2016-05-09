package com.clouway.sumator;

/**
 * Created by clouway on 14.04.16.
 */
public class SumatorDemo {
    public static void main(String[] args)  {
        Sumator sumator = new Sumator();
        String s = "";
        try {
            s = sumator.sum("a", "12");
        } catch (NumberFormatException e) {
            s = sumator.sum("56", "11");
        }
        System.out.println(s);
    }
}
