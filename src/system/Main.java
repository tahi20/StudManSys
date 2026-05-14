package system;
import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudMan manager = new StudMan();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Show Top Student");
            System.out.println("5. Average GPA");
            System.out.println("6. Save to File");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();

                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();

                        System.out.print("Enter GPA: ");
                        double gpa = scanner.nextDouble();

                        if (gpa < 0 || gpa > 4.0) {
                            throw new Graid(
                                    "GPA must be between 0 and 4"
                            );
                        }

                        Student student =
                                new Student(id, name, course, gpa);

                        manager.addStudent(student);

                        System.out.println("Student added.");

                    } catch (Graid e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int searchId = scanner.nextInt();

                    manager.searchStudent(searchId);

                    break;

                case 4:
                    manager.showTopStudent();
                    break;

                case 5:
                    manager.calculateAverageGpa();
                    break;

                case 6:
                    Fileman.saveToFile(manager);
                    break;

                case 7:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
