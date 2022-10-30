import java.util.ArrayList;

// 2) Пусть дан произвольный список целых чисел, удалить из него четные числа
/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {
        ArrayList<Integer> randomArray = myLib.getRandeomArray(10, 0, 10);
        System.out.println(randomArray);
        removesEvenNumbers(randomArray);
        System.out.println(randomArray);

    }

    //Метод удаляет четные числа из ArrayList<Integer> 
    public static void removesEvenNumbers(ArrayList<Integer> originalArray) {
        for (int i = 0; i < originalArray.size(); i++) {
            if (originalArray.get(i) % 2 == 0) {
                originalArray.remove(i);
                i--;
            }
        }
    }
    
}