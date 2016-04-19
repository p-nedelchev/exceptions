package task3.array;

/**
 * Created by clouway on 19.04.16.
 */
public class ArrayOperations {
  public int iter =0;
  public int[] array;

  public void initArray(int size) {
    array = new int[size];

  }

  public void addElement(int data) throws FullArrayException {
    if (iter < array.length) {
      array[iter] = data;
      iter++;
    } else {
      throw new FullArrayException(data);
    }
  }

  public void removeElement() throws EmptyArrayException {
    if (array[iter-1] == 0) {
      throw new EmptyArrayException();
    } else {
      array[iter-1] = 0;
      iter--;
    }
  }


  public void printArray() throws EmptyArrayPrintException {
    if (array[iter] == 0) {
      throw new EmptyArrayPrintException();
    }
    for (int i = 0; i < iter; i++) {
      System.out.println(array[i]);
    }
  }
}