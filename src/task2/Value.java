package task2;

public class Value {
    public String inputValue(int a) throws Exception {
        if (a < 0 || a > 100) {
            throw new OutOfRangeException("Value is out of range!");
        }
        return "Value is in range";
    }

}
