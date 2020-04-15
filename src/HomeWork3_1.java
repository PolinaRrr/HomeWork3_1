import java.util.Scanner;

/**
 * Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
 * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class HomeWork3_1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int x = makeANumber();
            guessTheNumber(x);

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int answer = scanner.nextInt();
            if (answer == 0) {
                System.out.println("Всего хорошего!");
                break;
            }
        }
    }

    /**
     * Метод генерирует случайным образом число от 0 до 9
     * @return сгенерированное число
     */
    private static int makeANumber() {
        int number = (int) (Math.random() * 10);
        return number;
    }

    /**
     * Метод проверяет угадал ли пользователь загаданное число
     * @param x загаданное число
     */
    private static void guessTheNumber(int x) {
        System.out.println("Ваша задача угадать число от 0 до 9" + "\n У Вас 3 попытки");
        //переменная, счетчик попыток
        int count = 3;
        while (count != 0) {
            int input_number = scanner.nextInt();
            if (input_number == x) {
                System.out.println("Вы угадали");
                return;
            } else if (input_number < x) {
                System.out.println("Загаданное число больше");
                count--;
            } else {
                System.out.println("Загаданное число меньше");
                count--;
            }
        }
        System.out.println("Вы проиграли!");
    }
}


