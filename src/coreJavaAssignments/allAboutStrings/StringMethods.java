package coreJavaAssignments.allAboutStrings;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate="25/11/1992";
        int startingIndex= birthDate.indexOf("1992");
        System.out.println("Birth year is : "+birthDate.substring(startingIndex));
    }
}
