package task1.sumexceptions;

/**
 * Created by clouway on 19.04.16.
 */
public class StringSum {
  public void check(String a)throws InvalidString{
    try{
      Integer.valueOf(a);
    }
    catch (IllegalArgumentException e){
      throw new InvalidString(a);
    }
  }
  public int sumString(String first, String second) throws InvalidString {
    check(first);
    check(second);
    int sum=Integer.valueOf(first)+Integer.valueOf(second);
    return sum;
  }
}
