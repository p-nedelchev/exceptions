package list;


/**
 * Created by clouway on 03.05.16.
 */
public class List {
    Object[] array;
    int index = 0;
    int size = 0;

    public List(int size) {
        this.size = size;
        this.array = new Object[size];
    }

    public void add(Object object) throws Exception {
        if (index < size) {
            array[index] = object;
            index++;
        } else {
            throw new Exception("The Array is full.");
        }
    }

    public void remove()  throws Exception {

        if(index != 0 ){
            array[index -1] = null;
            index--;
        }
        else if (array[0] == null ){ throw new Exception("The Array is empty");}



    }

    public String printAllElements() {
        String str = "";
        for (int i = 0; i < array.length; i++) {

            str += (array[i] + " ");

        }
        return str;
    }

}