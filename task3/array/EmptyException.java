package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class EmptyException extends Exception {
    public EmptyException() {
        super("\n You can't remove from the array, because there is nothing to remove. (The array is empty)");
    }

}
