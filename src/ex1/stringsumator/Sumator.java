package ex1.stringsumator;

/**
 * Created by clouway on 15.04.16.
 */
public class Sumator {

  public String stringSum(String str1, String str2) {
    return Integer.toString(Integer.parseInt(str1) + Integer.parseInt(str2));
  }


//  /**
//   * Returns the sum of two strings.
//   *
//   * @param str1
//   * @param str2
//   * @return
//   */
//  public String stringSum(String str1, String str2) throws IntegersOnlyStringException {
//    if (!check(str1)) {
//      throw new IntegersOnlyStringException(str1);
//    }
//    else if (!check(str2)) {
//      throw new IntegersOnlyStringException(str2);
//    }
//    else{
//      return Integer.toString(Integer.parseInt(str1) + Integer.parseInt(str2));
//    }
//  }
//
//  /**
//   * Checks the contains of a string for chars other than integer numbers.
//   *
//   * @param str
//   * @return
//   */
//  private boolean check(String str) {
//    char[] toCharArray = str.toCharArray();
//    char[] numberArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//    for (int i = 0; i < numberArray.length; i++) {
//      for (int j = 0; j < toCharArray.length; j++) {
//        if (toCharArray[j] == numberArray[i]) return true;
//      }
//    }
//    return false;
//  }
}
