package lesson8;

public class AnimalsRunner {

    public static void main(String[] args) {
        Animals dog = new Dog("Гав");
        Animals cat = new Cat ("Мяу");
        Animals rat = new Rat ("Пи");
        Animals crow = new Crow("Кар");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(rat);
        System.out.println(crow);
        System.out.println("_______________");

        cat.changeVoise("Мяу-мяу-мяу");
        System.out.println(cat);
        dog.changeVoise ("Гав-гав-гав");
        System.out.println(dog);
        rat.changeVoise("Пи-пи-пи");
        System.out.println(rat);
        crow.changeVoise("Кар-кар-кар");
        System.out.println(crow);
        System.out.println("_______________");

        Animals [] animals = new Animals [] {dog, cat, rat, crow};
         for (Animals animals1 : animals) {
             System.out.println(animals1);
         }
        System.out.println("_______________");
         cat.sound ();
         dog.sound();
         rat.sound();
         crow.sound();
         System.out.println("_______________");

         Animals [] newAnimals = new Animals[] {dog, cat, rat, crow};
         for (Animals newAnimals1 : newAnimals) {
             newAnimals1.sound();
         }

    }

}
