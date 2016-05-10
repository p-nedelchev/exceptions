package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) throws EmptyException, FullException, PrintException {
        Array array = new Array();
        array.iniArray(5);
        array.addElement(1);
        array.addElement(8);
        array.removeElement();
        array.printArray();
    }
}
