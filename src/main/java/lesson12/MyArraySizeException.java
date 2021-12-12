package lesson12;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException (String message) {
        super(message);
    }
    public MyArraySizeException() {
    }
}
