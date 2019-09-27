//3. Create a class Dog.
//        The dog should have a name and an age (private).
//        Create getters and setter for all the fields.


public class Lesson_5_3 {

    static class Dog {

        private int age;
        private String name;

        public Dog(int a, String n) {

            age = a;
            name = n;
        }


        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog(12, "tggkg");
        dog1.setAge(2);
        dog1.setName("dfgfsgsg");

        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
    }


}
