package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class Array {
    private int index = 0;
    private int[] array;

    /**
     * Constructor
     * @param size Array size
     */
    public Array(int size) {
        this.array = new int[size];
    }

    /**
     * Removes an element from the array
     *
     * @throws EmptyException
     */
    public void removeElement() throws EmptyException {
        if (array[index - 1] == 0) {
            throw new EmptyException();
        } else {
            array[index - 1] = 0;
            index--;
        }
    }

    /**
     * Adds an element to the array
     *
     * @param data Adds new element else throws FullException
     * @throws FullException
     */
    public void addElement(int data) throws FullException {
        if (index < array.length) {
            array[index] = data;
            index++;
        } else {
            throw new FullException(data);
        }

    }

    /**
     * Prints the elements
     *
     * @return Returns the elements
     */
    public String printAllElements() {
        String printAllElements = "";
        for (int i = 0; i < index; i++) {
            printAllElements += (array[i] + " ");
        }
        return printAllElements;
    }
}
