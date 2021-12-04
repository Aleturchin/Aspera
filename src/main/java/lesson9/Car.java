package lesson9;

public class Car extends Automobile {

    public Car(int fuelTank) {
        super(fuelTank);
    }
    int distance = 1_000;
    double drive = this.fuelTank/distance;
    public void move() {
        System.out.println("Легковая машина проедит " + drive);
    }

}




