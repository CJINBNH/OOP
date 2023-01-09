package OOP_seminars.seminar_03.Task1;

public class Student {
    private String name;
    private String dateOfBirth;
    private float averageGrade;

    
    
    public Student(String name, String dateOfBirth, float averageGrade) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", dateOfBirth=" + dateOfBirth + ", averageGrade=" + averageGrade + "]";
    }
}
