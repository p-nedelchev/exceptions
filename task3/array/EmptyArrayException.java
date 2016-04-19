package task3.array;


/**
 * Created by clouway on 19.04.16.
 */
public class EmptyArrayException extends Exception {
  public EmptyArrayException(){
    super("\n You cannot remove from the Array, because it is EMPTY.");
  }

}
