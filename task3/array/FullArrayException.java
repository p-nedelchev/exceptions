package task3.array;

/**
 * Created by clouway on 19.04.16.
 */
public class FullArrayException extends Exception {
  public FullArrayException(int a){
    super("\n You cannot add element "+a+" to the Array because it is FULL.");
  }
}
