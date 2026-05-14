package system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Fileman {

    public static void saveToFile(StudMan manager) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("students.txt"))) {

            for (Student student : manager.getStudents()) {

                writer.write(
                        student.getId() + "," +
                                student.getName() + "," +
                                student.getCourse() + "," +
                                student.getGpa()
                );

                writer.newLine();
            }

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
