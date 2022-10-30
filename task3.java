import java.util.ArrayList;

// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> randomArray = myLib.getRandeomArray(10, 0, 10);
        System.out.println(randomArray);
        int min  = getMin(randomArray);
        int max  = getMax(randomArray);
        int mean = getMean(randomArray);
        System.out.printf("Минимальное значение - %d \n", min);
        System.out.printf("Максимальное значение - %d \n", max);
        System.out.printf("Среднее значение - %d \n", mean);


    }
    public static int getMin(ArrayList<Integer> originalArray) {
        int minValue = originalArray.get(0);
        for (int i = 1; i < originalArray.size(); i++) {
            minValue = originalArray.get(i) < minValue ? originalArray.get(i) : minValue;
        }
        return minValue;
    }
    public static int getMax(ArrayList<Integer> originalArray) {
        int maxValue = originalArray.get(0);
        for (int i = 1; i < originalArray.size(); i++) {
            maxValue = originalArray.get(i) > maxValue ? originalArray.get(i) : maxValue;
        }
        return maxValue;
    }
    public static int getMean(ArrayList<Integer> originalArray) {
        int meanValue = originalArray.get(0);
        for (int i = 1; i < originalArray.size(); i++) {
            meanValue += originalArray.get(i);
        }
        return meanValue/originalArray.size();
    }
    
}

