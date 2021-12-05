package lesson10;

public class ConverterRunner {

     public static void main(String[] args) {

         // Конвертер значения градусов из шкалы Фаренгейта в шкалу Цельсия
        CelsiusConvertable convertable = new CelsiusConverter(80);
        convertable.convC();

        // Конвертер значения градусов из шкалы по Цельсию в шкалу Фаренгейта
        FahrenheitConvertable convertable1 = new FahrenheitConverter(0);
        convertable1.convF();

     }
}

