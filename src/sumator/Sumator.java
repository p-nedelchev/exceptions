package sumator;


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 14.04.16.
 */
public class Sumator {

     public Integer sum(Integer a, Integer b) {


        a += b;
        return a;
    }

    public Double sum(Double a, Double b) {
        a += b;
        return a;
    }

    public BigInteger sum(BigInteger a, BigInteger b) {



        return a = b.add(a) ;

    }

    public BigDecimal sum(BigDecimal a , BigDecimal b){

        return a = b.add(a);
    }

    public String sum(String a, String b) {
        String result = "";

        try {
            int value = Integer.parseInt(a) + Integer.parseInt(b);

            result = "" + value;

        } catch (NumberFormatException ex) {
            //either a or b is not a number
            result = "Invalid input";


        }
        return result;

    }

}
