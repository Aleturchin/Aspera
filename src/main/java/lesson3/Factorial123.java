package lesson3;

import java.util.Scanner;
// Вычисление факториала числа n!, где n – входной параметр метода (целое число)
public class Factorial123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Для вычисления факториала введите число:");
        int s = getFactorial(scanner.nextInt());
        System.out.println("Факториал этого числа равен: " + s);
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}

