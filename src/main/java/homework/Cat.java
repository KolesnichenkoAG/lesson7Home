package homework;

public class Cat {
    private String name;
    private int appetite;
    private int fullness;
    int startfullness;

    public Cat(String name, int appetite, int fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate plate) {
        if (plate.check(appetite) == true && startfullness < fullness) {
            System.out.println("Кот " + name + " начал есть, съел " + appetite);
            plate.decreaseFood(appetite);
            startfullness = (startfullness + appetite);
            satiety();
        }
        if (plate.check(appetite) == false){
            System.out.println("Коту " + name + " нечего есть ");
        }
        if (startfullness < fullness && plate.check(appetite) == false) {
            System.out.println("Кот " + name + " не наелся ");
        }
    }
    public boolean satiety() {
        if (startfullness >= fullness) {
            System.out.println("Кот " + name + " наелся он съел " + fullness);
            return true;
        }
        return false;
    }
}
