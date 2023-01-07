package OOP_seminars.seminar_02.Task2;

public class ProgrammerEmployee extends Employee {

    @Override
    public String getJobTitle() {
        return "Programmer";
    }

    @Override
    public int getSalary() {
        return 100000;
    }

    @Override
    public void work() {     
        System.out.println("Programmer is coding");   
    }
    
}
