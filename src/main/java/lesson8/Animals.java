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
}
