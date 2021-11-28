package lesson8;

public class Crow extends Animals {

    public Crow (String voice) {
        super(voice);
    }
    public void changeVoise(String newVoice) {
        super.changeVoise(newVoice);
        System.out.println("Каркает ворона");
    }
}
