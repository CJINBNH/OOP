package OOP_practicalTasks.PT6.task1;

public  class FingerPrint implements UnlockMethod {
    
    private String fingerprint;

    public FingerPrint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println("fingerprint...fingerprint...fingerprint...");
        System.out.println("Телефон разблокирован по отпечатку пальца");
    }

}
