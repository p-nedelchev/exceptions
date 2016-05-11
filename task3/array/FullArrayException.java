package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class FullArrayException extends Exception {
    public FullArrayException(int a) {
        super("\n You can't add element " + a + " because the array is already full!");
    }
}
