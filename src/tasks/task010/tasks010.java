package tasks.task010;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class tasks010 {

    public static void run(String[] args) {

        int n = 10;
        double[] array = new double[n];//создаем массив и указываем сколько памяти мы ему выделяем
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();//добавляем в массив рандомные числа
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];//переприсваиваем значение переменной max если то значение что в ней лежит меньше того элемента массива с которым мы равниваем
                max = new BigDecimal(max).setScale(2, RoundingMode.HALF_EVEN).doubleValue();//обрезаем количество символов после нуля для удобного чтения
            if(min > array[i])
                min = array[i];//переприсваиваем значение переменной min если то значение которое мы сравниваем из массива меньше значения что лежит в min
                min = new BigDecimal(min).setScale(2, RoundingMode.HALF_EVEN).doubleValue();//обрезаем количество символов после нуля для удобного чтения
            avg += array[i]/array.length;//получаем среднее значение массива путем прибавление к значению что лежит в avg значение которое мы получаем когда делим значение из переменной i на длмнну массива
            avg = new BigDecimal(avg).setScale(2, RoundingMode.HALF_EVEN).doubleValue();//обрезаем количество символов после нуля для удобного чтения
        }

        System.out.println("max number = " + max);//выводим максимальное значение массива
        System.out.println("min number = " + min);//выводим минимальное значение массива
        System.out.println("avg number = " + avg);//выводим среднее значение массива
    }

}
