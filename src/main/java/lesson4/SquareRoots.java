package lesson4;

import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, корень которого нужно вычислить:");
        long s = square(scanner.nextInt());
        System.out.println("Корень этого числа равен " + s);
    }

    public static long square(long f) {
        long resalt = f;
 /*  Цикл делит входящее число на числа меньше себя, пока результат деления не будет равен делителю.
    Например 9 разделить на 3 равно 3 -соотвествует условию.
  */
        for (long i = 1; i <= f; i++) {
            resalt = resalt / i;
            if (resalt == i) {
                break;
            }
        }
        return resalt;
    }
    }

