package task1.sumator;

/**
 * Created by clouway on 04.05.16.
 */
public class InvalidString extends Exception {
    public InvalidString(String c) {
        super("\n The string " + c + " has to be a number.");
    }
}
