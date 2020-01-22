

public class Dog extends Animal {
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.limitRun = random.nextInt(500);
        this.limitSwim = random.nextInt(10);
        this.limitJump = random.nextDouble() * 0.5;
    }

    public void catInfo() {
        System.out.println("Пес имя: " + name + " цвет: " + color);
    }

    public void jump(double heigth) {
        if (heigth <= limitJump)
            System.out.println("Пес " + name + " подпрыгнул на " + heigth + " м.");
        else
            System.out.println("Пес " + name + " не умеет прыгать так высоко!");
    }

    public void run(int length) {
        if (length <= limitRun)
            System.out.println("Пес " + name + " пробежал " + length + " м.");
        else
            System.out.println("Пес " + name + " не может бегать так далеко!");
    }

    public void swim(int swim) {
        if (swim <= limitRun)
            System.out.println("Пес " + name + " проплыл " + swim + " м.");
        else
            System.out.println("Пес " + name + " не может плыть так далеко!");
    }
}
