package lesson7;

public class Runner {

    public static void main(String[] args) {
        Cat Cat = new Cat("Kitty", "cat", 2, 10, 3.5, 0);
        Cat anotherСat = new Cat("Bagira", "cat", 5, 8, 5, 0 );
        Dog Dog = new Dog("Jack", "dog", 5, 100, 14.5, 20);
        Tiger Tiger = new Tiger("Sherkhan", "tiger", 14, 500, 150.0,
                50);

        if (Cat != anotherСat) {
            System.out.println("Китти и Багира - это разные кошки");
        }
        if (Tiger.running >= Dog.running) {
            System.out.println("Тигры выносливее собак и могут пробежать 500 метров");
        }
        if (Cat.swimming <= 0) {
            System.out.println("Кошки не умеют плавать");
        }
        if (Tiger.swimming >=0) {
            System.out.println("Тигры хорошо плавают и могут проплыть " + Tiger.swimming + " метров");
        }
        Tiger.getAge();
        System.out.println("Тигру " + Tiger.nickname + " в следующем году исполнится " + Tiger.age + " лет");
    }


}
