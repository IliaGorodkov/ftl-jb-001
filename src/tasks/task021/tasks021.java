package tasks.task021;

public class tasks021 {

    public static void run(String text){
        text = text.toLowerCase();//пришедшую строку делаем в нижнем регистре

        int[] result = new int['z' - 'a' + 1];
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                result[ch - 'a']++;
            }
        }

        for(int i = 0; i < result.length; i++){
            System.out.println((char) (i + 'a') + " = " + result[i]);//если в пришедшей строке есть подходящие буквы то будет выведено бука и цифра 1 показывающая наличие
        }
    }

}
