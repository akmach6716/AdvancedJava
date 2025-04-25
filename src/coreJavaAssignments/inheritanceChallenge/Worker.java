package coreJavaAssignments.inheritanceChallenge;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;
//By creating a default constructor without any parameters resolves the issues if a subclass is created for this class
    public Worker()
{

}
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge()
    {
        int currentYear=2025;
        int birthYear= Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }
    //this method will be overwritten by subclasses to get the correct amount
    public double collectPay()
    {

        return 0.0;
    }
    public void terminate(String endDate)
    {
        this.endDate= endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
