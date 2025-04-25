package coreJavaAssignments.Assignment5;

public class AgeValidation {
    public static void main(String[]  args) {
        try {
            if (args.length != 2) {
                throw new InvalidAgeException("Invalid number of arguments. Please provide name and age.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be between 18 and 59.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NumberFormatException e) {
            System.err.println("Invalid age format. Please enter a valid integer.");
            System.exit(1);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
