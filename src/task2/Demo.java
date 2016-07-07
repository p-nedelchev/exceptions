package task2;

public class Demo {
    public static void main(String[] args) {
        readAndCheckValue value = new readAndCheckValue();
        try {
            System.out.println(value.inputValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
