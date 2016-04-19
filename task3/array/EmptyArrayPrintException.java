package task3.array;

/**
 * Created by clouway on 19.04.16.
 */
public class EmptyArrayPrintException extends Exception {
  public EmptyArrayPrintException(){
    super("\n Cannot print the array because it is empty.");
  }
}
