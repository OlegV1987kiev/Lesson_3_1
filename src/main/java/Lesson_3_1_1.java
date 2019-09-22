public class Lesson_3_1_1 {
    public static void main(String[] args) {
        int i;
        for (i = 10; i < 20; i++) {
            System.out.println("Цикл for: " + i);

        }
        i = 10;
        while (i < 20) {
            System.out.println("Цикл while: " + i);
            i++;
        }

        i = 10;
        do {
            System.out.println("Цикл do: " + i);
            i++;
        }
        while (i < 20);
    }

}
