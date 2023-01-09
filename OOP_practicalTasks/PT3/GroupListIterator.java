package OOP_practicalTasks.PT3;

import java.util.ListIterator;

public class GroupListIterator extends StudentGroupIteranor implements ListIterator<Student> {

    public GroupListIterator(StudentGroup studentGroup, int current) {
        super(studentGroup);
        index = current;
    }

    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public Student previous() {
        return Student.getStudent(index--);
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.sizeStudentList();
    }

    @Override
    public Student next() {
        return Student.getStudent(index++);
    }

    @Override
    public int previousIndex() {
        return index--;
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public void remove() {        
    }

    @Override
    public void set(Student student) {        
    }

    @Override
    public void add(Student student) {        
    }
    
}
