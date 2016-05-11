package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) throws EmptyException, FullException {
        Array array = new Array(123);
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.removeElement();
        array.addElement(4);
        array.addElement(5);
        System.out.println(array.printAllElements());
    }
}