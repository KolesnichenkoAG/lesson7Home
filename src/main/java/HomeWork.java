import homework.Cat;
import homework.Plate;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Lesson 7 version 1");
        Cat cat = new Cat("Max", 15, 40);
        Plate plate = new Plate(80, 10);
        Cat[]cats = new Cat[4];
        cats[0] = new Cat("Neo", 5, 30);
        cats[1] = new Cat("Mai", 10, 10);
        cats[2] = new Cat("Trinity", 15, 45);
        cats[3] = new Cat("Tin", 8, 30);
        plate.info();
        cat.eat(plate);
        cats[1].eat(plate);
        // cats[2].eat(plate);
        // cats[3].eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();

    }
}
