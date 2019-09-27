public class lesson_5_2 {
    //2. Implement the method fight() depending on weight, strength and age of the boxer:
//    You should write dependency by yourself. The method should return true or false if our boxer won or lost.
//    1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
    public static class Boxer {
        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }


        public static boolean fight(Boxer anotherBoxer, Boxer outBoxer) {
            if (anotherBoxer.age == outBoxer.age && anotherBoxer.weight == outBoxer.weight && anotherBoxer.strength == outBoxer.strength) {
                System.out.println("it's true");
                return true;
            } else {

                System.out.println("it's false");
                return false;
            }
        }

        public static void main(String[] args) {

        }
    }
}