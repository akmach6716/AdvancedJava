package coreJavaAssignments.AccountAssignment;

public class Mainaccount {
    public static void main(String[] args) {
        Account bobsaccount= new Account("235545", 1500000.0, "Bob Stewart",
                "bob4556@gmail.com", "676989809");
        System.out.println(bobsaccount.getNumber());
        System.out.println(bobsaccount.getBalance());

    }
}
