package OOP_seminars.seminar_02.Task2;

import java.util.ArrayList;
import java.util.List;

public class TeamleaderEmployee extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public TeamleaderEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String getJobTitle() {
        return "Teamlider";
    }

    @Override
    public int getSalary() {
        return 200000;
    }

    @Override
    public void work() {
        System.out.println("Makes his subordinates work");
        for(Employee employee: employees){
            employee.work();
        }   
    }

    @Override
    public String toString() {
        return "TeamleaderEmployee [employees=" + employees + "]";
    }
    
}
