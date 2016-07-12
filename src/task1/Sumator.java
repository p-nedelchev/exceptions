package task1;

public class Sumator {
    public double sum(String a, String b){
        try{
            Double.parseDouble(a);
            Double.parseDouble(b);
        }catch (Exception e){
            throw new InputDataException("Wrong value");
        }
       return Double.parseDouble(a) + Double.parseDouble(b);
    }
}

