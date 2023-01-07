package OOP_seminars.seminar_02.Task2;

public class DesignerEmployee extends Employee {

    @Override
    public String getJobTitle() {
        return "Designer";
    }

    @Override
    public int getSalary() {
        return 80000;
    }

    @Override
    public void work() {
        
        System.out.println("Designer is painting");
    }
    
}
