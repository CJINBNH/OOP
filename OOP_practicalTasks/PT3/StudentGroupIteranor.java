package OOP_practicalTasks.PT3;

import java.util.Iterator;

public class StudentGroupIteranor implements Iterator<Student> {

    protected int index = -1;
    protected StudentGroup studentGroup;

    
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
 