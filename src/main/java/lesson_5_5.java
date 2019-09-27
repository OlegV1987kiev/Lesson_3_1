public class lesson_5_5 {
//    5. Hide all the field and methods which allow to change the inner state of the class(Encapsulation).

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(0);
        cat1.setName("dd");
        cat1.setWeight(77);
        System.out.println("" + cat1.getName());
        System.out.println("" + cat1.getAge());
    }

    static class Cat {
        private String name;
        private int age;
        private int weight;

        Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Cat() {

        }

        public String getName() {
            return name;
        }

        public void setName(String catName) {
            if (catName.isEmpty()) {
                System.out.println("Wrong name ");
            } else {
                name = catName;
            }

        }

        public int getAge() {
            return age;
        }

        public void setAge(int userAge) {
            if (userAge < 1) {
                System.out.println("Error: ");
            } else {
                age = userAge;
            }
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int age) {
            this.weight = weight;
        }
    }
}

