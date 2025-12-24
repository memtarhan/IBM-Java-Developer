public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
        } catch (ArithmeticException e) {
            int result = 10 / 0; // This line will throw an exception
        } finally {
            System.out.println("Finally block executed");
        }
    }
}