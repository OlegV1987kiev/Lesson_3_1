//4. Given an array of 10 integers. To display the sum of all its elements except the first and last.
public class Lesson_3_1_4 {
    public static void main(String args[]) {
        Integer arr[] = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + "  ");
        }
        int sum = 0;

        for (int i = 1; i < arr.length - 1; i++) {


            sum = sum + arr[i];


        }
        System.out.print(sum);
    }
}
