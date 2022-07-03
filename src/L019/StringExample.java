package L019;

import java.util.stream.Stream;

public class StringExample {
    private static String str(){
        return "Добро пожаловать на FoodTech School";
    }

    private static void runContentEquals(){
        System.out.println("runContentEquals");
        String str1 = str();
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str2:" + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3:" + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4:" + result);
    }

    private static void runEqualsIgnoreCase(){
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");

        String str1 = "Добро пожаловать на FoodTech School";
        String str2 = str1;
        String str3 = "Сайт для изучения java";
        String str4 = "ДОБРО ПожАлОвать на FOODtech ScHoOl";

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));


    }

    private static void runCompareToIgnoreCase(){
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 ="Я вызываю метод!";
        String str2 ="Я Вызываю Метод!";
        String str3 ="Я Вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    private static void runToLowerCase(){
        System.out.println("");
        System.out.println("runToLowerCase");
        String str1 ="Я вызываю метод!";

        System.out.println(str1.toLowerCase());

    }

    private static void runToUpperCase(){
        System.out.println("");
        System.out.println("runToUpperCase");
        String str1 = "Я вызываю метод!";

        System.out.println(str1.toLowerCase());

    }

    private static void runConcat(){
        System.out.println("");
        System.out.println("runConcat");

        String s = "Я вызываю метод!";
        s = s.concat(" И я вызываю класс!");

        s = s + " String";

        System.out.println(s);
    }

    private static void runMatches(){
        System.out.println("");
        System.out.println("runMatches");


        String s = "Добро пожаловать на FoodTech School";

        System.out.println(s.matches("(.*)FoodTech(.*)"));
        System.out.println(s.matches("FoodTech"));
        System.out.println(s.matches("Добро(.*)"));
    }

    private static void runContains(){
        System.out.println("");
        System.out.println("runContains");


        String s = "twinkle twinkle little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("5432"));
    }

    private static void runRegionMatches(){
        System.out.println("");
        System.out.println("runRegionMatches");

        String s1 = "Добро пожаловать на FoodTech School",
                s2 = "FoodTech School",
                s3 = "Java",
                s4 = "FOODTECH SCHOOL";

        System.out.println(s1.regionMatches(20,s2,0,8));
        System.out.println(s1.regionMatches(20,s3,0,8));
        System.out.println(s1.regionMatches(true,20,s3,0,8));

    }

    private static void runStartWith(){
        System.out.println("");
        System.out.println("runStartWith");

        String s1 = "Добро пожаловать на FoodTech School",
                s2 = "Добро",
                s3 = "Java",
                s4 = "FOODTECH";

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    private static void runEndWith(){
        System.out.println("");
        System.out.println("runEndWith");

        String s1 = "Добро пожаловать на FoodTech School",
                s2 = "School",
                s3 = "Java",
                s4 = "FOODTECH";

        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    private static void runLines(){
        System.out.println("");
        System.out.println("runLines");

        String s = "asdsadsad\n" + "ghjghjghj\n"+"fghgfhgfh\n"+"t56578\n"+"687hk\n";

        System.out.println(s);

        Stream<String> lines = s.lines();
        lines.forEach( System.out::println);
        System.out.println(lines);
    }

    private static void runToCharArray(){
        String s1 = "Добро пожаловать на FoodTech School";
        System.out.println(s1.toCharArray()[4]);

    }

    private static void runFormat(){
        float floatVar = 1.2f;
        int intVar = 12;
        String stringvar = "String";

        String fs;
        fs = String.format("Значение float = %.1f, значение int = %d, значение string = %s", floatVar,intVar,stringvar);
        System.out.println(fs);
    }

    private static void runValue(){
        double d =12312.2;
        boolean b = true;
        long l = 111l;
        char[] chars = {'d','r'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));
    }

    private static void runRepeat(){
        String str = "string";
        String repeat = str.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf(){
        String str = str();
        String sub1 = "Food", sub2 = "Tech";
        System.out.println(str.indexOf(sub1));
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("gdf"));

    }

    private static void runLastIndexOf(){
        String str = str();
        String sub1 = "o";
        System.out.println(str.lastIndexOf(sub1));

    }

    private static void runSubString(){
        String str = str();
        System.out.println(str.substring(11,15));
    }

    private static void runSubSequence(){
        String str = str();
        System.out.println(str.subSequence(0,10));
    }

    private static void runSplit(){
        String str = "Дбро-пожаловать-на-сайт";
        String[] result =str.split("-");
        for(String s: str.split("-")){
            System.out.println(s);
        }
        return;
    }

    private static void runJoin(){
        String join = String.join(", ","1","2","3");
        System.out.println(join);
    }

    private static void runTrim(){
        String s = "      String";
        System.out.println(s);
        System.out.println(s.trim());

    }
    private static void runReplase(){
        String s = str();

        System.out.println(s);
        System.out.println(s.replace("o", "-"));
        System.out.println(s.replaceFirst("o", "-"));
        System.out.println(s.replaceAll("o", "-"));

    }


    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValue();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequence();
        runSplit();
        runJoin();
        runTrim();
        runReplase();
    }












}
