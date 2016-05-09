/**
 * Created by clouway on 09.05.16.
 */
public class DemoSummedString {
    public static void main(String[] args) {
        try {
            SummedString strings = new SummedString();
        System.out.println(strings.sum("1", "-2"));
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Not and int");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}