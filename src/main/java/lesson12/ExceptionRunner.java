package lesson12;

public class ExceptionRunner {

    public static void main(String[] args) {

        Array exception = new Array(4,4); // Необходимо указать размер массива
        try {
            exception.checkSize();
            exception.checkFormat(); // Значение элементов массива указываются в классе "Array"
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("В ячейке массива лежит что-то не то");
        }
    }
}
