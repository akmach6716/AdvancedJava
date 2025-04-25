package coreJavaAssignments.interviewQuesitionsPractice;

import java.util.Arrays;

public class Evensumadjacentpairs {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 7, 9, 2, 8};
        System.out.println(evenSum(nums));

    }

    public static int evenSum(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] + nums[i + 1]) % 2 == 0) {
                counter++;
                System.out.println(Arrays.toString(new int[]{nums[i], nums[i+1]}));
                ++i;

            }
        }
        return counter;
    }


}

