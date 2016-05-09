/**
 * Created by clouway on 09.05.16.
 */
public class DemoSummedString {
    public static void main(String[] args) throws IntegerToStringOnlyException {

        try {
            SummedString strings = new SummedString();
            System.out.println(strings.sum("9", "-2"));
        } catch (NumberFormatException ex) {
            throw new IntegerToStringOnlyException();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}