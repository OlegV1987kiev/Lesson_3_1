import java.io.*;

public class Lesson_4_1_10 {
    public static void main(String args[]) {


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10; j++) {


                if (i >= 2 && j >= 2 && i <= 4 && j <= 9) {

                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}