import java.io.*;

public class Lesson_4_1_11 {


        public static void printTriagle(int n)
        {

            for (int i=0; i<n; i=i+2)
            {


                for (int j=n-i; j>1; j=j-1)
                {

                    System.out.print(" ");
                }

                for (int j=0; j<=i; j=j+1 )
                {

                    System.out.print("* ");
                }


                System.out.println();
            }
        }


        public static void main(String args[])
        {
            int n = 11;
            printTriagle(n);
        }
    }

