import java.util.Random;

public class Animal {
    String name;
    Random random = new Random();
    double limitJump;
    int limitRun;
    int limitSwim;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }
}



