class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}