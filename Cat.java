

public class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        this.limitRun = random.nextInt(200);
        this.limitSwim = 0;
        this.limitJump = random.nextDouble() * 2;
    }

    public void catInfo() {
        System.out.println("Кот имя: " + name + " цвет: " + color);
    }

    public void jump(double heigth) {
        if (heigth <= limitJump)
            System.out.println("Кот " + name + " подпрыгнул на " + heigth + " м.");
        else
            System.out.println("Кот " + name + " не умеет прыгать так высоко!");
    }

    public void run(int length) {
        if (length <= limitRun)
            System.out.println("Кот " + name + " пробежал " + length + " м.");
        else
            System.out.println("Кот " + name + " не может бегать так далеко!");
    }

    public void swim(int swim) {
        System.out.println("Кот " + name + "не умеет плавать!");
    }
}
