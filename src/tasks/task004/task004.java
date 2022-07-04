package tasks.task004;
import java.util.Scanner;//подключаем библиотеку со сканнером
public class task004 {

    public static void run(String[] args) {
        System.out.print("Введите любое целое положительное число: ");//выводим в консоль предложение с вводом положительного числа
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//считываем что к вонсоли ввел пользователь

        int sum = 0;//В переменную sum будут суммироваться числа с помощью цикла for
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);//результат суммирования
    }


}
