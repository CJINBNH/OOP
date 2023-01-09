package OOP_seminars.seminar_03.Task1;

import java.util.Iterator;

public class StudentGroupIteranor implements Iterator<Student> {

    private int index = -1;
    private StudentGroup studentGroup;

    

    public StudentGroupIteranor(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
            return this.index < studentGroup.sizeStudentList() - 1;
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }
    
}
