package lesson2;

public class Formula {
    public static void main(String[] args) {
        System.out.println("Периметр прямоугольника равен:");
        long s = formula (4,7);
        System.out.println(s + " (см)");
    }

    /**
     *
     * @param arg1 Длина высоты прямоугольника (см)
     * @param arg2 Длина ширины прямоугольника (см)
     * @return Периметр прямогольника равен P = 2(a+b)
     */
    public static long formula (int arg1, int arg2) {
        int a = arg1 + arg2;
        int b = 2 * a;
        return b;
    }

}
