package lesson9;

public abstract class Automobile {

   protected final int fuelTank;

    public Automobile(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public abstract void move ();

}
