package tasks.task007;

public class tasks007 {
    public static void run(){
        System.out.println("");

        for(int i = 0; i < 3; i++) {//выводим линии наших звездочек 3 раза
            for (int f = 0; f < 5; f++) {
                System.out.print("* ");//выводим звездочки 5 раз
            }
            System.out.println();
        }
    }

}
