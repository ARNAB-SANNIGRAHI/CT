package day14_CollectionFramework;

public class CollegeManagement {

    enum Mode {
        ONLINE, OFFLINE
    }

    enum Gender {
        MALE, FEMALE
    }

    interface Staff {
        void work();
    }

    class Student {
        int id;
        String name;
        Gender gender;
        Mode mode;

        Student(int id, String name, Gender gender, Mode mode) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.mode = mode;
        }

        void display() {
            System.out.println("Student: " + id + " " + name + " " + gender + " " + mode);
        }
    }

    class Trainer implements Staff {
        int id;
        String name;
        Gender gender;
        Mode mode;

        Trainer(int id, String name, Gender gender, Mode mode) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.mode = mode;
        }

        @Override
        public void work() {
            System.out.println("Trainer teaches in " + mode + " mode");
        }

        void display() {
            System.out.println("Trainer: " + id + " " + name + " " + gender + " " + mode);
        }
    }

    class SecurityGuard implements Staff {
        int id;
        String name;

        SecurityGuard(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public void work() {
            System.out.println("Security Guard maintains campus security");
        }

        void display() {
            System.out.println("Security Guard: " + id + " " + name);
        }
    }

    public static void main(String[] args) {

        CollegeManagement college = new CollegeManagement();

        Student s1 = college.new Student(1, "Anita", Gender.FEMALE, Mode.ONLINE);
        s1.display();

        Trainer t1 = college.new Trainer(101, "Rahul", Gender.MALE, Mode.OFFLINE);
        t1.display();
        t1.work();

        SecurityGuard g1 = college.new SecurityGuard(201, "Suresh");
        g1.display();
        g1.work();
    }
}
