package OOP_practicalTasks.PT6.task1;

public class NoPassword implements UnlockMethod {
    
    private String nopassword;

    public NoPassword(String nopassword) {
        this.nopassword = nopassword;
    }

    public String getNopassword() {
        return nopassword;
    }

    @Override
    public void unlock() {
        System.out.println("Нажмите любую клавишу...");
        System.out.println("Телефон разблокирован");
    }
}
