package OOP_practicalTasks.PT3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {
    
    static List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        StudentGroup.studentList = studentList;
    }
    
    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        StudentGroup.studentList = studentList;
    }

    public int sizeStudentList() {
        return studentList.size();
    }

    public Student getStudent(int index) {
        return studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIteranor(this);
    }

    public ListIterator<Student> listIterator(int index) {
        return new GroupListIterator(this, index);
    }

    public Iterator<Student> reverseIterator () {
        return new ReverseIterator(this);
    }
}
 