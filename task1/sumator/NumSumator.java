package task1.sumator;

import task1.sumator.InvalidString;

/**
 * Created by clouway on 04.05.16.
 */
public class NumSumator {
    /**
     * Checks if the input is string or not
     * @param a String to be checked
     * @throws InvalidString
     */
    private void check(String a) throws InvalidString {
        try {
            Integer.valueOf(a);
        } catch (IllegalArgumentException z) {
            throw new InvalidString(a);
        }
    }

    /**
     *
     * @param a First num
     * @param b Second num
     * @return Returns the sum
     * @throws InvalidString
     */
    public int sum(String a, String b) throws InvalidString {
        check(a);
        check(b);
        int sum = Integer.valueOf(a) + Integer.valueOf(b);
        return sum;
    }
}
