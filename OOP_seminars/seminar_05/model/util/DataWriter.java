package OOP_seminars.seminar_05.model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import OOP_seminars.seminar_05.model.data.User;



public class DataWriter {

    // public void writeToFile (Iterable<Student> students) {

    //     try(FileWriter myWriterCreate = new FileWriter("students.txt")) {
    //         for (Student student : students) {
    //             myWriterCreate.write(student.toString());
    //         }
    //     }
    //     catch (IOException e) {}
    
    // }
    
    /**
     * @param <U>
     * @param list
     */
    public static <U extends User> void dataWrite (List<U> list) {
        try(FileWriter writer = new FileWriter("student.txt", false)) {
            for (U user : list) {
                writer.write(user.toFileString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
