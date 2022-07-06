package tasks.task011;
import java.util.Arrays;
public class tasks011 {

        public static void run(String[] args) {
            int[] mas = {8, 2, 10, 22, 6};//создаем массив

            boolean isSorted = false;//своеобразный показатель того что массив уже отсортирован или нет
            int buf;

            while (!isSorted) {// пока isSorted не будет true,то-есть массив не будет отсортирован, наш цикл будет работать
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {//тут делаем проверку на элементы массива,если i-й элемент больше чем элемент i+1(следующий элемент) томеняем их местами
                    if (mas[i] > mas[i + 1]) {//тут если у нас левое значение больше правого то мы меняем их местами и указываем что массив не отсортирован
                        isSorted = false;// если isSorted ложно то это значит что наш массив не отсортирован и нужно продолжить менять местами элементы

                        buf = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buf;
                    }
                }
            }

            System.out.println(Arrays.toString(mas));//выводим в консоль отсортированный массив
        }

    }
