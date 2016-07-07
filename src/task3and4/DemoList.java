package task3and4;

public class DemoList {
    public static void main(String[] args) {
        myList list = new myList();
        try{
            list.insert(2);
            list.insert(4);
            list.insert(6);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
        list.remove();
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }
        list.printElements();

    }
}
