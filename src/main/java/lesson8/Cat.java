package lesson8;

public class Cat extends Animals {

    public Cat (String voice) {
        super(voice);
    }
    public void changeVoise(String newVoice) {
        super.changeVoise(newVoice);
        System.out.println("Кашка мяукает");
    }
    public void sound() {
        System.out.println("Кошка сказала мяу");
    }

}
