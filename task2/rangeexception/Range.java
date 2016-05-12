package task2.rangeexception;

/**
 * Created by clouway on 04.05.16.
 */
public class Range {
    /**
     * Checks if the input is between 0 and 100
     * @param z Is for out of range and throws RangeException
     * @throws RangeException
     */
    public void checkInput(int z, int x, int y) throws RangeException {
        if (z < x || z > y) {
            throw new RangeException();
        }
    }
}
