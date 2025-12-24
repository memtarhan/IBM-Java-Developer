public class ExceptionExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // This will cause an ArithmeticException
        try {
            int result = numerator / denominator; // This line may throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block executes regardless of an exception.");
        }
    }
}