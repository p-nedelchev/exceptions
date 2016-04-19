package task2.inputscanner;


/**
 * Created by clouway on 19.04.16.
 */
public class InputScanner {
  public void checkInput(int a)throws NumberOutOfBoundsException{
    if(a<0||a>100){
      throw new NumberOutOfBoundsException();
    }
  }
}
