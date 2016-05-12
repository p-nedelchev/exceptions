package task2.rangeexception;

/**
 * Created by clouway on 04.05.16.
 */
public class Range {
    private int x;
    private int y;

    public Range(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * Checks if the input is between 0 and 100
     * @param z Is for out of Range and throws RangeException
     * @throws RangeException
     */
    public void checkInput(int z) throws RangeException {
        if (z < x || z > y) {
            throw new RangeException();
        }
    }
}
