package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    // Вычисление коренй квадратного уравнения типа (a*x^2 + b*x + c = 0)
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите значение а:");
        double a = scanner1.nextDouble();
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else {
            System.out.println("Ведите значение в:");
            double b = scanner1.nextDouble();
            System.out.println("Ведите значение c:");
            double c = scanner1.nextDouble();
            double d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b - Math.sqrt(d)) / (2 * a);
                double x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println("Корни уравнения: x1 =" + x1 + ", x2 = " + x2);
            } else if (d == 0) {
                double x;
                x = - b / (2 * a);
                System.out.println("Уравнение имеет единственный корень: x =" + x);
            } else {
                System.out.println("Нет действительных решений уравнения");
            }

        }
    }

}
