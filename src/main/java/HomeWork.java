import homework.Cat;
import homework.Plate;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Lesson 7 version 1");
        Cat cat = new Cat("Max", 10);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
