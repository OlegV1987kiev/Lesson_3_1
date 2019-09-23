//2. Print all the numbers from 1 to 100, which are divided by 3 without a remainder.

public class Lesson_4_1_2 {
    public static void main(String[] args) {
        for (int i = 3; i < 100; i = i + 3) {
            System.out.println("numbers which are divided by 3 without a remainder: " + i);
        }
    }
}

