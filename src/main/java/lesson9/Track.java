package lesson9;

public class Track extends Automobile {

    public Track(int fuelTank) {
        super(fuelTank);
    }
    int distance = 1_000;
    double drive = this.fuelTank/distance;
    public void move() {
        System.out.println("Грузовая машина проедит " + drive);
    }
}
