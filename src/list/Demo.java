package list;

/**
 * Created by clouway on 03.05.16.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        List ls = new List(3);
        ls.add(123);
        ls.add(123);
        ls.add(123);
        System.out.println(ls.printAllElements());
        ls.remove();
        System.out.println(ls.printAllElements());
        ls.remove();
        System.out.println(ls.printAllElements());
        ls.remove();
        System.out.println(ls.printAllElements());
        System.out.println(ls.printAllElements());
        ls.add(323);
        System.out.println(ls.printAllElements());
        ls.add(323);
        System.out.println(ls.printAllElements());
        ls.add(231);
        System.out.println(ls.printAllElements());
        ls.add(321321);


    }
}
