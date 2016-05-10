package task2.rangeexception;

/**
 * Created by clouway on 04.05.16.
 */
public class RangeException extends Exception {
    public RangeException() {
        super("\n The number should be between 1 and 100.");
    }
}