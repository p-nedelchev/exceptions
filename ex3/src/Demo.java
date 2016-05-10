import java.lang.*;
import java.lang.Object;
import java.util.ArrayList;

/**
 * Created by clouway on 10.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        List list = new List(arrayList, 3);
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        Object object5 = new Object();
        try {


            list.add(object);
            list.printAllElements();
            list.add(object2);
            list.printAllElements();
            list.add(object3);
            list.printAllElements();
            list.add(object4);
            list.printAllElements();
            list.remove(object4);
            list.remove(object5);
            list.printAllElements();
            list.remove(object);
            list.printAllElements();
            list.remove(object2);
            list.printAllElements();
            list.remove(object3);
            list.printAllElements();
            list.remove(object4);
            list.printAllElements();
            list.remove(object4);
            list.remove(object5);
            list.printAllElements();
        } catch (ListIsEmptyException e) {
            e.printStackTrace();
        } catch (ListIsFullException e) {
            e.printStackTrace();
        }

    }
}
