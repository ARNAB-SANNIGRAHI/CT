package core_java;

public class School_Management_Application {

    // Base class
    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    // Student class (IS-A Person)
    static class Student extends Person {
        private int rollNumber;
        private float grade;

        public int getRollNumber() {
            return rollNumber;
        }
        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }
        public float getGrade() {
            return grade;
        }
        public void setGrade(float grade) {
            this.grade = grade;
        }
    }

    // Course class
    static class Course {
        private int courseId;
        private String courseName;

        public int getCourseId() {
            return courseId;
        }
        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }
        public String getCourseName() {
            return courseName;
        }
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    }

    // HAS-A relationship class
    static class StudentCourse {
        private Student student;
        private Course course;

        public StudentCourse(Student student, Course course) {
            this.student = student;
            this.course = course;
        }

        public void showStudentCourseDetails() {
            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Grade: " + student.getGrade());

            System.out.println("\nCourse Details:");
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
        }
    }

    // main method
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Arnab");
        s1.setAge(21);
        s1.setRollNumber(101);
        s1.setGrade(9.2f);

        Course c1 = new Course();
        c1.setCourseId(501);
        c1.setCourseName("Core Java");

        StudentCourse sc = new StudentCourse(s1, c1);
        sc.showStudentCourseDetails();
    }
}
