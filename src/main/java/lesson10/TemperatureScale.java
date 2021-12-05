package lesson10;

public enum TemperatureScale {
    CELSIUS(1), FAHRENHEIT(2);

    private int index;

    TemperatureScale(int index) {
        this.index = index;
    }

    static TemperatureScale as(int index) {
        for (TemperatureScale temperatureScale : values()) {
            if (temperatureScale.index == index) {
                return temperatureScale;
            }
        }
        return null;
    }
}

