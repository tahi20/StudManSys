package system;
public class Student extends Persona {

    private String course;
    private double gpa;

    public Student(int id, String name, String course, double gpa) {
        super(id, name);
        this.course = course;
        this.gpa = gpa;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}
