package tasks.task009;
import java.util.Scanner;//подключаем библиотеку со сканнером
public class tasks009 {

    public static void run(String[] args) {
        String answer;
        boolean exit;

        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        String transport = "Троллейбус";
        String surrender = "Сдаюсь";

        for(int i = 1; i <= 3; i++){
            if (exit == true){break;}
            answer = inputAnswer.next ();
            if (answer.equalsIgnoreCase(transport)) {
                System.out.println("Правильно!");
                exit = true;
                break;
            }else if (answer.equalsIgnoreCase(surrender)) {
                System.out.println ("Правильный ответ: троллейбус.");
                exit = true;
                break;
            }
            System.out.println("Подумай еще.");
        }


    }



}
