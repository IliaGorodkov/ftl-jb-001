package tasks.task013;

public class tasks013 {

    public static void run() {
        Integer[] myArray = {1, 3, 4, 5};//создаем массив
        int num = 3;//другое целое число

        for (int i = 0; i < 4; i++) {
            if (myArray[i] == num){//условие если у нас элемент массива равен другому целому числу(num) то мы его удаляем, но чтобы не было пробелом то заменяем на другое число
                myArray[i] = 10;
            }
            System.out.println( myArray[i]);//выводим значения подправленного массива в консоль
        }
    }
}
