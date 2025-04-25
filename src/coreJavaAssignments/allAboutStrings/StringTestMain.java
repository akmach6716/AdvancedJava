package coreJavaAssignments.allAboutStrings;

public class StringTestMain {
    public static void main(String[] args) {
        printInformaton("Hello World");
    }
    public static void printInformaton(String string) {
        int length = string.length();
        System.out.println("Length= " + length);
        System.out.println("First = " + string.charAt(0));
        System.out.printf("Size =%d %n", length);

    }
}
