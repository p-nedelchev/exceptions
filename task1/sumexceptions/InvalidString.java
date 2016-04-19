package task1.sumexceptions;

/**
 * Created by clouway on 19.04.16.
 */
public class InvalidString extends Exception {
  public InvalidString(String s){
    super("\nThe variable " +s+ " is not a number.");
  }
}
