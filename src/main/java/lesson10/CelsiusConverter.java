package lesson10;

public class CelsiusConverter implements CelsiusConvertable {

    private double c;

    public CelsiusConverter(double c) {
        this.c = c;
    }

    @Override
    public void convC() {
        c = (c - 32) / 1.8;
        System.out.println("Значение температуры в градусах " + TemperatureScale.as(1) +" "+c);
    }
}
