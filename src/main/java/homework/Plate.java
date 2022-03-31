package homework;

public class Plate {
    private int foodQuantity;
    private int minFood;

    public Plate(int foodQuantity, int minFood) {
        this.foodQuantity = foodQuantity;
        this.minFood = minFood;
    }

    public void info() {
        System.out.println("Текущее кол-во еды " + foodQuantity);
    }
    public void decreaseFood(int foodQuantity) {
            if (this.foodQuantity > minFood) {
                this.foodQuantity -= foodQuantity;
            }
    }
    public boolean check(int minFood) {
        if (this.foodQuantity >= minFood) {
            return true;
        }
        return false;
    }
}
