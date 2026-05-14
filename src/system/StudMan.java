package system;
import java.util.ArrayList;

public class StudMan {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println("----------------");
            student.displayInfo();
        }
    }

    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.displayInfo();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void showTopStudent() {

        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student student : students) {

            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }

        System.out.println("Top Student:");
        topStudent.displayInfo();
    }

    public void calculateAverageGpa() {

        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getGpa();
        }

        double average = total / students.size();

        System.out.println("Average GPA: " + average);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}