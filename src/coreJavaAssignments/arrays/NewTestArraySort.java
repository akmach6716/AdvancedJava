package coreJavaAssignments.arrays;

import java.util.Arrays;
import java.util.Random;

public class NewTestArraySort {
    public static void main(String[] args) {

    }

    private static int[] getRandomIntArray(int len)
    {
        Random random= new Random();
        int[] randomArray= new int[len];
        for(int i=0; i<len; i++)
        {
            randomArray[i]=random.nextInt(1000);
        }
        return randomArray;
    }
}
