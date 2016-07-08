package task1;

public class Sumator {
    public double sum(String a, String b) throws MyException {
        double sum = 0;
        try {
            sum = Double.parseDouble(a) + Double.parseDouble(b);
        } catch (NumberFormatException e) {
            throw new MyException();
        }
        return sum;
    }
}

