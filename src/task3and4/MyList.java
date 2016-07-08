package task3and4;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;

public class MyList {
    List newList;

    public MyList(int a) {
        newList = new ArrayList<Integer>(a);
    }

    public boolean insert(int a) throws Exception {
        if (newList.size() >= a) { //here we choose length of list
            throw new Exception("You can enter only 4 elements !");
        } else {
            newList.add(a);// add element
        }
        return true;
    }

    public void remove() throws Exception {
        if (newList.size() != 0) { //check for any elements in list
            newList.remove(newList.size() - 1); //remove last element from list
        } else {
            throw new Exception("There is nothing to remove !");
        }

    }

    public void printElements() { // print list elements
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}



