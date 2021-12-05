package lesson10;

public class FahrenheitConverter implements FahrenheitConvertable {

    private double f;

    public FahrenheitConverter(double f) {
        this.f = f;
    }

    public void convF() {
            f = (f * 1.8) + 32;
            System.out.println("Значение температуры в градусах " + TemperatureScale.as(2) +" "+ f);
    }
}
