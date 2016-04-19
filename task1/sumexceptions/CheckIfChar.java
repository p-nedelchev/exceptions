package task1.sumexceptions;

/**
 * Created by clouway on 19.04.16.
 */
public class CheckIfChar {
  public void check(String a)throws InvalidString{
    try{
      Integer.valueOf(a);
    }
    catch (IllegalArgumentException e){
      throw new InvalidString(a);
    }
  }
}
