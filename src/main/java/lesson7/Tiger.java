package lesson7;

public class Tiger {

    String nickname;
    String animal;
    int age;
    int running;
    double weight;
    int swimming;

    public Tiger(String nickname, String animal, int age, int running, double weight, int swimming) {
        this.nickname = nickname;
        this.animal = animal;
        this.age = age;
        this.running = running;
        this.weight = weight;
        this.swimming = swimming;
    }

    public int getAge() {
        return age++;
    }
}
