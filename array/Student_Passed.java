package array;

class Student1 {
    int id;
    String name;
    int marks;

    Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    static Student1[] filterStudentOnMarks(Student1[] stus, int pass) {
        Student1[] passStu = new Student1[stus.length];
        int j = 0;

        for (int i = 0; i < stus.length; i++) {
            if (stus[i].marks >= pass) {
                passStu[j++] = stus[i];
            }
        }
        return passStu;
    }
}

public class Student_Passed {
    public static void main(String[] args) {

        Student1[] students = {
            new Student1(1, "ABC", 85),
            new Student1(2, "BCD", 40),
            new Student1(3, "CDE", 72),
            new Student1(4, "DEF", 30)
        };

        int passMarks = 50;

        Student1[] passed =
                Student1.filterStudentOnMarks(students, passMarks);

        System.out.println("Passed Students:");
        for (int i = 0; i < passed.length && passed[i] != null; i++) {
            System.out.println(
                passed[i].id + " " +
                passed[i].name + " " +
                passed[i].marks
            );
        }
    }
}
