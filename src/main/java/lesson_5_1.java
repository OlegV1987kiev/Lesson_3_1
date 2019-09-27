public class lesson_5_1 {


    static class Human {
        public int weight;
        public int age;
        public String first_name;
        public String last_name;
        public double height;

        public Human(int w, int a, String f, String l, double h) {
            weight = w;
            age = a;
            first_name = f;
            last_name = l;
            height = h;

        }
    }

    public static void main(String[] args) {

        Human hum1= new Human (95,33,"Dima","Boyko",180);

        System.out.println( hum1);
    }



}
