package lesson6;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("Введите число для определения длины массива: ");
        while (!array.hasNextInt()) {
            array.next();
            System.out.println("Введено не целочисленное значение");
        }
        int s = matrixlong (array.nextInt());
        if (s <= 0) {
            System.out.println("Введено недействительное число");
        } else {
            double[] matrix = new double[s];
            for (int i = 0; i < matrix.length; i++) {

            }
            fillarray(matrix);
            double max = getMax(matrix);
            System.out.println("Максимальное значение элемента в массиве: " + max);
            double min = getMin(matrix);
            System.out.println("Минимальное значение элемента в массиве: " + min);
            double average = getAverage(matrix);
            System.out.println("Среднее значение элементов в массиве: " + average);
        }
    }
    public static double getAverage(double[] matrix) {
        double averageValue = 0;
        double sum = 0;
        for (int i = 0; i<matrix.length; i++) {
            sum += matrix [i];
        }
        averageValue = sum / matrix.length;
        return averageValue;
    }
    public static double getMin(double[] matrix) {
        double minValue = matrix [0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] < minValue) {
                minValue = matrix [i];
            }
        }
        return minValue;
    }
    public static double getMax(double[] matrix) {
        double maxValue = matrix [0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i] > maxValue) {
                maxValue = matrix [i];
            }
        }
        return maxValue;
    }
    public static int matrixlong(int num) {
        if (num <=0) {
            return 0;
        } else {
            return num;
        }
    }
    public static void fillarray (double [] matrix) {
        for (int i = 0; i<matrix.length; i++) {
            matrix [i] = Math.random();
            System.out.println(matrix [i]);
        }
    }

}
