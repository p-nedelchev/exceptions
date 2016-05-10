package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class PrintException extends Exception {
    public PrintException() {
        super("\n You can't print the array, because there is nothing to print. (The array is empty)");
    }
}
