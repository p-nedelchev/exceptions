package com.clouway.third_task;

/**
 * @author Petar Nedelchev (peter.krasimirov@gmail.com)
 */
public class DynamicList {
    private Object [] list;
    private int length;

    public DynamicList(int len) {
        list = new Object[len];
        length = 0;
    }

    /**
     * Adds a new element in the list
     * @param element int element to be added
     */
    public void add (Object element) {
        if (length == list.length) {
            throw new FullListException("The list is full. Can't add: " + element);
        }
        list[length] = element;
        length++;
    }

    /**
     * Prints the elements of the list
     */
    public void printAllElements() {
        for (int i = 0; i < length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    /**
     * Removes last element of the list
     */
    public void remove() {
        if (length == 0) {
            throw new EmptyListException();
        }
        length--;
    }
}
