package com.clouway.iorange;

import java.util.Scanner;


/**
 * Created by clouway on 03.05.16.
 */
public class Range {

    public int checkRange(int low, int high) throws Exception {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i >= low && i <= high) {

        } else {
            throw new Exception("The number is not in iorange");

        }
        return i;


    }
}
