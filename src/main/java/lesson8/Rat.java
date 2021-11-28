package lesson8;

public class Rat extends Animals {

    public Rat (String voice) {
        super(voice);
    }
    public void changeVoise(String newVoice) {
        super.changeVoise(newVoice);
        System.out.println("Крыса пищит");
    }
}
