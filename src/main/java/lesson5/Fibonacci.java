package lesson5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введено не целочисленное значение");
        }
        int s = fnumbers (scanner.nextInt());
        System.out.println("Значение числа фибоначчи: " + s);

    }

    public static int fnumbers (int num) {
        if (num <= 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fnumbers(num - 1) + fnumbers(num - 2);
        }

    }
}
