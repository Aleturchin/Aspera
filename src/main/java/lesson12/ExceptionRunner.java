package lesson12;

public class ExceptionRunner {

    public static void main(String[] args) {
        Arrey exception = new Arrey(4,4);
        try {
            exception.arr();
            exception.arr2();
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
        }
    }
}
