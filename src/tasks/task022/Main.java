package tasks.task022;

interface Converter {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;// значение температуры в цельсиях
    }
}

class KelvinConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;// значение температуры в кельвинах
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;// значение температуры в фаренгейтах
    }
}

public class Main {
    public static void run(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature));// выводим в температуру цельсиях
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature));// выводим в температуру ккельвинах
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature));// выводим в температуру фаренгейтах
    }
}