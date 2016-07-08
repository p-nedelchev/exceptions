package task3and4;

public class DemoList {
    public static void main(String[] args) throws ListIsFullException, NothingToRemoveException {
        MyList list = new MyList(5);
        try {
            list.insert(2);
            list.insert(4);
            list.insert(6);
            list.insert(5);
            list.insert(1);

        } catch (Exception e) {
            throw new ListIsFullException("List is full !");
        }
        try {
            list.remove();
        } catch (Exception e1) {
            throw new NothingToRemoveException("Nothing to Remove");
        }
        list.printElements();

    }
}
