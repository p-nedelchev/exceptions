package task2.rangeexception;

/**
 * Created by clouway on 04.05.16.
 */
public class InputScanner {
    /**
     * Checks if the input is between 0 and 100
     * @param z Is for out of range and throws RangeException
     * @throws RangeException
     */
    public void checkInput(int z) throws RangeException {
        if (z < 0 || z > 100) {
            throw new RangeException();
        }
    }
}
