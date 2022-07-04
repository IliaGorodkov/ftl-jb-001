package tasks.task008;

public class tasks008 {

        public static void run(){
            System.out.println("");

            int a = 1;
            int b = 1;
            int sum_fib;
            System.out.print(String.format("%s %s", a, b + " "));//немного костыльно показываем первые две единички
            for(int i = 0; i < 9; i++){
                sum_fib = a + b;//слаживаем предыдущие два значения
                a = b;
                b = sum_fib;
                System.out.print(sum_fib + " ");//выводим наши числа
            }

        }

}
