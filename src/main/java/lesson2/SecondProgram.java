package lesson2;

public class SecondProgram {
    // Примеры арифметических операторов в Java
    public static void main(String[] args) {
        System.out.println("Арифметические операторы:");
        long summa = calculate1 (3,5);
        System.out.println("Сложение. Ответ = " + summa);
        long minus = calculate2 (6,10);
        System.out.println("Вычитание. Ответ = " + minus);
        long multiplication = calculate3 (6,4);
        System.out.println("Умножение. Ответ = " + multiplication);
        long division = calculate4 (10,10);
        System.out.println("Деление. Ответ = " + division);
        long remains = calculate5 (20,6);
        System.out.println("Остаток. Ответ = " + remains);
    }
    public static long calculate1 (int arg1, int arg2) {
        return arg1 + arg2;
    }
    public static long calculate2 (int arg1, int arg2) {
        return arg2 - arg1;
    }
    public static long calculate3 (int arg1, int arg2) {
        return arg1 * arg2;
    }
    public static long calculate4 (int arg1, int arg2) {
        return arg2 / arg1;
    }
    public static long calculate5 (int arg1, int arg2) {
        return arg1 % arg2;
    }
    }
