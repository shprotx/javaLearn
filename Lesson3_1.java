// 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
import java.util.Scanner;
import java.util.Random;

public class Lesson3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber;
        int userNumber;
        int playAgain = 1;
        int count = 0;

        while (playAgain == 1) {
            randomNumber = random.nextInt(10);
            System.out.println(randomNumber);
            while (count < 3) {
                System.out.println();
                System.out.println("Введите ваше число (от 0 до 9): ");
                userNumber = scanner.nextInt();
                if (randomNumber == userNumber) {
                    System.out.println("Вы угадали!");
                    System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
                    playAgain = scanner.nextInt();
                    count = 0;
                    continue;
                } else if (userNumber < randomNumber) {
                    System.out.println("Ваше число МЕНЬШЕ загаданного");
                    System.out.println("Попробуйте еще раз!");
                    count++;
                } else if (userNumber > randomNumber) {
                    System.out.println("Ваше число БОЛЬШЕ загаданного");
                    System.out.println("Попробуйте еще раз!");
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Вы проиграли :(((");
                System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
                playAgain = scanner.nextInt();
                count = 0;
            }



        }
    }
}
