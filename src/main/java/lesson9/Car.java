package lesson9;

public final class Car extends Automobile {

    public Car(int fuelTank) {
        super(fuelTank);
    }
    int distance = 1_000;
    double drive = fuelTank/distance;
    public void move() {
        if (drive == 1) {
            System.out.println("Автомобиль проедит " + distance + " без дозаправки");
        } else {
            System.out.println("Автомобиль не проедит " + distance + " без дозаправки");
        }

    }

}




