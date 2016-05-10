package task3.array;

/**
 * Created by clouway on 10.05.16.
 */
public class Array {
    public int z = 0;
    public int[] array;

    /**
     * Initializes the array
     * @param size
     */
    public void iniArray(int size) {
        array = new int[size];

    }

    /**
     * Removes an element from the array
     * @throws EmptyException
     */
    public void removeElement() throws EmptyException {
        if (array[z - 1] == 0) {
            throw new EmptyException();
        } else {
            array[z - 1] = 0;
            z--;
        }
    }

    /**
     * Adds an element to the array
     * @param data Adds new element else throws FullException
     * @throws FullException
     */
    public void addElement(int data) throws FullException {
        if (z < array.length) {
            array[z] = data;
            z++;
        } else {
            throw new FullException(data);
        }
    }

    /**
     * Prints the array
     * @throws EmptyException
     */
    public void printArray() throws EmptyException {
        if (array[z] == 0) {
            throw new EmptyException();
        }
        for (int i = 0; i < z; i++) {
            System.out.println(array[i]);
        }
    }
}
