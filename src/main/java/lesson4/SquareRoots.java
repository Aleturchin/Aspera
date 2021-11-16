package lesson4;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, корень которого нужно вычислить:");
        while (!scanner.hasNextLong()) {
            scanner.next();
            System.out.println("Введено не числовое значение. Введите число:");
        }
        long s = square(scanner.nextLong());
        if (s <= 0) {
            System.out.println("Число не имеет целочисленных корней");
        }
        else {
            System.out.println("Корень этого числа равен " + s);
        }
    }

    public static long square(long f) {
        long resalt = f;
        for (long i = 1; i <= f; i++) {
            if (resalt/i == i) {
                resalt = resalt / i;
            }
        }
        if (resalt == f) {
            return 0;
        }

        return resalt;
    }
}

