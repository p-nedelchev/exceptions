package com.clouway.task3;

public class ArrayOperation {
  public Object[] array;
  public int index = 0;

  public ArrayOperation(int length) {
    this.array = new Object[length];
  }

  /**
   * adding object to an array
   * @param object
   * @throws ArrayIsfullException();
   */
  public void addElement(Object object) throws ArrayIsfullException {
    if (index < array.length) {
      array[index] = object;
      index++;
    } else {
      throw new ArrayIsfullException();
    }
  }

  /**
   * removing object from an array
   *
   * @throws EmptyArrayException();
   */
  public void remove() throws EmptyArrayException {
    if (index != 0) {
      array[index - 1] = null;
      index--;
    } else {
      throw new EmptyArrayException();
    }
  }

  @Override
  public String toString() {
    String str = " ";
    for (int i = 0; i < array.length; i++) {
      str += array[i] + " ";
    }
    return str;

  }
}

