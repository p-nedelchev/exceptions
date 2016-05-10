/**
 * Created by clouway on 10.05.16.
 */
public class OutOfBoundException extends Exception {

    public OutOfBoundException(){
        super("Number is less than minimum or larger than maximum.");
    }
}
