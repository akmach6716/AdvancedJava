package coreJavaAssignments.arrays;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
     int [] newArray= new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(newArray));
     reverseArray(newArray);
        System.out.println(Arrays.toString(newArray));

    }
    private static void reverseArray(int[] array)
    {  int maxIndex=array.length-1;
        int halflength= array.length/2;

       for(int i=0; i<array.length/2; i++)
       { int temp= array[i];
           array[i]= array[maxIndex-i];
           array[maxIndex-i]= temp;

       }
    }
}
