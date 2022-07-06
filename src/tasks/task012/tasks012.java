package tasks.task012;
import java.io.IOException;
import java.util.Random;

public class tasks012 {

    public static void run(String args[]) throws IOException {

        Integer min = 2;//указываем минимальное число для нашей функции рандом(Random)
        Integer max = 100;//указываем максимальное число для нашей функции рандом(Random)

        Random rnd = new Random(System.currentTimeMillis());
        int number = min + rnd.nextInt(max - min + 1);//генерируем случайное число в диапазаное 2-100

        for (int i = 1; i < 2; i++) {
            if (number % 2 != 0 || number % 5 != 0) {
                System.out.print(number+"\n");//выводим получившееся число
            }
        }


    }
}
