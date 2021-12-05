package lesson9;

public final class Track extends Automobile {

    public Track(int fuelTank) {
        super(fuelTank);
    }
    int distance = 1_000;
    double drive = this.fuelTank/distance;
    public void move() {
        if (drive == 1) {
            System.out.println("Автомобиль проедит " + distance + " без дозаправки");
        } else {
            System.out.println("Автомобиль не проедит " + distance + " без дозаправки");
        }
    }
}
