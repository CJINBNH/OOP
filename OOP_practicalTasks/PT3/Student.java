package OOP_practicalTasks.PT3;

public class Student {
    
    private String name;
    private String dayOfBirth;
    private float averageGrade;
    
    public Student(String name, String dayOfBirth, float averageGrade) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", dayOfBirth=" + dayOfBirth + 
        ", averageGrade=" + averageGrade + "]";
    }

    public static Student getStudent(int index) {
        return StudentGroup.studentList.get(index);
    }
}
