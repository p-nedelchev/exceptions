package com.clouway.sumator;

/**
 * Created by clouway on 14.04.16.
 */
public class SumatorDemo {
    public static void main(String[] args)   {
        Sumator sumator = new Sumator();
        String s = "";
        try {
            s = sumator.sum("jk", "5");
        } catch (NumberFormatException e){
            throw new TheInputMustBeNumberException();
        }
        System.out.println(s);
    }
}
