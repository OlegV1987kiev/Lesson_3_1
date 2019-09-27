public class Lesson_5_4 {
    //    4. Correct nine classes: Worker (employee), Clerk (clerk), IT (IT specialist), Programmer (programmer), ProjectManager (project manager), CTO (CTO), HR (recruiter), OfficeManager (office manager), Cleaner (cleaner).
//    Inherit a programmer, project manager and technical director from an IT specialist.
//    Inherit the recruiter, cleaner and office manager from the clerk.
//    Inherit the clerk and IT professional from the employee.
    public static class Task {
        public static void main(String[] args) {

        }


        public class Employee {
            int age = 30;
        }

        public class Worker extends Employee {

        }

        public class Clerk extends Employee {

        }

        public class IT extends Employee {

        }

        public class Programmer extends IT {

        }

        public class ProjectManager extends IT {

        }

        public class CTO extends Worker {

        }

        public class OfficeManager extends Worker {

        }

        public class HR extends Clerk {

        }

        public  class Cleaner extends Clerk {
          int  cleanerAge = age;

            public Cleaner(){

            }

            void tell() {
              System.out.println(super.age);
          }


        }
    }
}
