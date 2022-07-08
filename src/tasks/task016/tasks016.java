package tasks.task016;

import java.util.Arrays;

public class tasks016 {

    public static int bruteForce(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }



    public static int binarySearchRecursively(double[] sortedArray, double key) {// Двоичный поиск
        return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
    }

    /**
     * Вспомогательный метод для {@link #binarySearchRecursively(double[], double)}
     *
     * Будем делить отрезок пополам, но не копировать, а просто "сдвигать границы",
     * и вызывать этот же метод рекурсивно. Для этого используем low и high
     *
     * @param sortedArray сортированный массив
     * @param key искомое значение
     * @param low от какого значения ищем
     * @param high до какого значения ищем
     * @return индекс элемента
     */
    private static int binarySearchRecursively
    (double[] sortedArray, double key, int low, int high) {
        int middle = (low + high) / 2; // середина

        if (high < low) { // больше делить нечего
            return -1;
        }

        if (key == sortedArray[middle]) { // если нашёлся
            return middle;
        } else if (key < sortedArray[middle]) { // ищем в левой половине
            return binarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursively( // ищем в правой половине
                    sortedArray, key, middle + 1, high);
        }
    }

    // Вспомогательный метод для тестов
    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static void run(String[] args) {
        double[] array = generateRandomArray(100000000);
        Arrays.sort(array); // сначала сортируем


        long time = System.currentTimeMillis(); // нынешнее время(unix-time)
        bruteForce(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        binarySearchRecursively(array, 0.5);
        System.out.println(System.currentTimeMillis() - time);
    }
}
