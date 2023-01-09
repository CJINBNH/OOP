package OOP_practicalTasks.PT3;

public class ReverseIterator extends StudentGroupIteranor {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.sizeStudentList() - 1;
    }

    @Override
    public boolean hasNext() {
        return index > -1;
    }

    @Override
    public Student next() {
        return studentGroup.getStudent(index--);
    }

}
