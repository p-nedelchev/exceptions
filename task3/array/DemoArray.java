package task3.array;

/**
 * Created by clouway on 19.04.16.
 */
public class DemoArray {
  public static void main(String[] args) throws FullArrayException, EmptyArrayException, EmptyArrayPrintException {
    ArrayOperations test=new ArrayOperations();
    test.initArray(4);
    test.addElement(1);
    test.removeElement();
    test.addElement(1);
    test.addElement(2);
    test.addElement(3);
    test.addElement(4);
    test.addElement(5);
//    test.removeElement();
//    test.removeElement();
//    test.removeElement();
//    test.removeElement();
    test.printArray();


  }
}
