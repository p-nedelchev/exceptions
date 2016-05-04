package readingintfromconsole;

import java.util.Scanner;


/**
 * Created by clouway on 03.05.16.
 */
public class ConsoleReader {

    public int checkifthenumberisintherange(int low, int high) throws Exception {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i >= low && i <= high) {

        } else {
            throw new Exception("The number is not in range");

        }
        return i;


    }
}
