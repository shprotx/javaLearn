public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food >= n)
            food -= n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public int getFood() {
        return food;
    }
    public void addFood(int i) {
        food += i;
    }
}
