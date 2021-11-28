package lesson8;

public class Dog extends Animals {

    public Dog (String voice) {
        super(voice);
    }

    public void changeVoise(String newVoice) {
        super.changeVoise(newVoice);
        System.out.println("Собака громко лает");
    }
    public void sound () {
        System.out.println("Собака сказала гав");
    }

}
