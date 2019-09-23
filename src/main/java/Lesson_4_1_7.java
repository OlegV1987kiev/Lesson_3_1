//
//7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, method should return -1 to indicate an invalid value.
//        The method should return the greatest common divisor of two numbers.

public class Lesson_4_1_7 {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(35,49));
    }

    public static int getGreatestCommonDivisor(int number, int number2){
        if (number <10|| number2<10 ){
            return -1;
        }
        else {
            int  gcd=1;
            for(int i = 1; i <= number && i <= number2; i++)
            {
                if(number%i==0 && number2%i==0)
                    gcd  = i;
            }
            return gcd ;
        }
    }
}