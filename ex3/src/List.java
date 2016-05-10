import java.lang.*;
import java.lang.Object;
import java.util.ArrayList;

/**
 * Created by clouway on 10.05.16.
 */
public class List {
    private ArrayList<Object> list;
    private final int size;

    public List(ArrayList<Object> list, int size) {
        this.list = list;
        this.size = size;
    }

    public void add(Object object) throws ListIsFullException {
        if (list.size() <= size) {

            list.add(object);
        } else {
            throw new ListIsFullException();
        }
    }

    public void remove(Object object) throws ListIsEmptyException {
        if (list.size() != 0) {
            list.remove(object);
        } else {
            throw new ListIsEmptyException();
        }
    }

    public void printAllElements() {
        System.out.println(list);
    }


}
