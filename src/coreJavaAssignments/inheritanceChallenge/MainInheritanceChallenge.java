package coreJavaAssignments.inheritanceChallenge;


public class MainInheritanceChallenge {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "10/11/1993", "01/01/2019");
        System.out.println(tim);
        System.out.println("Age : " + tim.getAge());
        System.out.println("Pay : " + tim.collectPay());
        SalariedEmployee joe = new SalariedEmployee("Tim", "10/21/1995", "01/01/2020", 95000);
        System.out.println(joe);
        System.out.println("Age : " + joe.getAge());
        System.out.println("Pay : " + joe.collectPay());
        joe.retire();
        System.out.println("Pension Pay : " + joe.collectPay());
        HourlyEmployee mary= new HourlyEmployee("Mary", "12/12/1993","01/01/2015",60);
        System.out.println(mary);
        System.out.println("Hourly pay : "+ mary.collectPay());
        System.out.println("Double  pay : "+ mary.getDoublePay());

    }
}
