//6. Write a method named getEvenDigitSum with one parameter of the type "int".
//        The method should return the sum of even digits within the number. If the number is negative, method should return -1;

public class Lesson_4_1_6 {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(478));
    }

    public static int getEvenDigitSum(int number){
        if (number <0 ){
            return -1;
        }
        else {
            int count = 0;
            int even = 0;
            while(number > 0){
                even = number % 10;
                number = number / 10;
                if(even % 2 == 0){
                    count += even;
                }
            }
            return count;
        }
    }

}