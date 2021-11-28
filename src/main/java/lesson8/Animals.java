package lesson8;

public class Animals {

    private String voice;

    public Animals(String voice) {
        this.voice = voice;
    }

    public void changeVoise(String newVoice) {
        this.voice = newVoice;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "voice='" + voice + '\'' +
                '}';
    }
// Метод sound будет использоваться вместо метода voice, указанного в задании
    public void sound () {
        System.out.println("Животные издают разные звуки");
    }
}
