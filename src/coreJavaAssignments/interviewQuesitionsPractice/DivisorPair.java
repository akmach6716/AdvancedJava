package coreJavaAssignments.interviewQuesitionsPractice;

import java.util.Arrays;

public class DivisorPair {
    public static void main(String[] args) {
        System.out.println(countDivisorpairs(new int[]{3, 4, 6, 8, 9}, 4));
    }

    public static int countDivisorpairs(int[] arr, int divisor) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % divisor == 0) {
                    count++;
                    System.out.println(Arrays.toString(new int[]{arr[i], arr[j]}));
                }
            }
        }
        return count;
    }
}
