package OOP_seminars.seminar_05.model.data;

import java.util.Locale;

public class Student extends User {

    private String nameOfFaculty;
    private int courseOfStudy;
    
    public Student(String firstName, String lastName, String nameOfUniversity, String nameOfFaculty,
            int courseOfStudy) {
        super(firstName, lastName, nameOfUniversity);
        this.nameOfFaculty = nameOfFaculty;
        this.courseOfStudy = courseOfStudy;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public int getCourseOfStudy() {
        return courseOfStudy;
    }

    @Override
    public String toFileString() {
        return super.toFileString() + String.format(Locale.US, ", %s, %s", nameOfFaculty, courseOfStudy);
    }

    @Override
    public String toString() {
        return "Student [nameOfFaculty=" + nameOfFaculty + ", courseOfStudy=" + courseOfStudy + "]";
    }

    
}
