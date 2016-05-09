import static java.lang.Integer.parseInt;

/**
 * Created by clouway on 09.05.16.
 */
public class SummedString {
    /**
     * Sum two strings parsed to integer
     * @param one
     * @param two
     * @return String
     */
    public String sum(String one, String two){
        return String.valueOf(parseInt(one) + parseInt(two));
    }
}
