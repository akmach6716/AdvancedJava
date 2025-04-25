package coreJavaAssignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MainMinEleChallenge {
    public static void main(String[] args) {
    int [] returnedArray= readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        System.out.println("Min number of the array is : "+findMin(returnedArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of numbers with comma separeted values ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int ele : array) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }
}
