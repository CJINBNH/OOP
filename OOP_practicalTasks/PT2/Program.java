package OOP_practicalTasks.PT2;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Float> students = new HashMap<>();
        students.put("Константин Симонов", 5.0f);
        students.put("Николай Кузнецов", 3.5f);
        students.put("Сергей Лапшин", 4.0f);
        students.put("Александр Васильев", 4.5f);
        students.put("Денис Гуляев", 4.8f);

        JsonFormat.saveAs(students);
        XmlFormat.saveAs(students);
        TxtFormat.saveAs(students);
    }
}
