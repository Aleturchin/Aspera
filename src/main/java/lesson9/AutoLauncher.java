package lesson9;

public class AutoLauncher {

    public static void main(String[] args) {
        Automobile car1 = new Car (500);
        Automobile car2 = new Car (400);
        Automobile car3 = new Car (200);
        Automobile car4 = new Car (350);
        Automobile car5 = new Car (300);
        Automobile trak1 = new Track(1200);
        Automobile trak2 = new Track(1100);
        Automobile trak3 = new Track(900);
        Automobile trak4 = new Track(1050);
        Automobile trak5 = new Track(800);

        Automobile [] newAutomobile = new Automobile[] {car1, car2, car3, car4, car5,
                trak1, trak2, trak3, trak4, trak5};
        for (Automobile newAutomobile1 : newAutomobile ) {
            newAutomobile1.move ();
        }

    }


}