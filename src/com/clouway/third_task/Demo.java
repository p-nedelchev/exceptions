package com.clouway.third_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {

        DynamicList list = new DynamicList(3);
        int value1 = 6;
        int value2 = 10;
        int value3 = 9;
        int value4 = 3;
        list.add(value1);
        list.add(value2);
        list.add(value3);
        list.printAllElements();
        list.remove();
        list.printAllElements();
        list.remove();
        list.remove();
        list.add(value4);
        list.printAllElements();
        list.remove();
        list.remove();
    }
}
