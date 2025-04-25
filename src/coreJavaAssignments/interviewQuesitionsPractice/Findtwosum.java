package coreJavaAssignments.interviewQuesitionsPractice;

import java.util.Arrays;

public class Findtwosum {
    public static void main(String[] args) {
        int[] num = {4, 3, 6, 9, 12, 8};
        System.out.println(Arrays.toString(twoSum(num, 15)));


    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("indexes of the elements are - " + i + " and " + j);
                    return new int[]{nums[i], nums[j]};

                }
            }
        }
        return new int[]{0};
    }
}
