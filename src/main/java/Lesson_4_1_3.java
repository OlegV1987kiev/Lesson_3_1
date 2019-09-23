//3. Fill the array with numbers from 100 to 0.

import java.util.*;

public class Lesson_4_1_3 {


    public static void main(String args[]) {
        Integer arr[] = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
//Сортируем массив
        Arrays.sort(arr, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}