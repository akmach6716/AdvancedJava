package coreJavaAssignments.arrays;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[5][4];
        int[][] multiArray2= new int[3][5];
       // System.out.println(Arrays.toString(multiArray));
        //System.out.println(multiArray.length);
        for (var outer : multiArray) {
            for (int ele : outer) {
               // System.out.print(ele);
            }
            System.out.println();
        }
       // System.out.println(Arrays.deepToString(multiArray));

        for(int i=0; i<multiArray2.length; i++ )
        { int[] innerArray= multiArray2[i];
            for(int j=0; j< innerArray.length; j++)
            {
                System.out.print(multiArray2[i][j]+" ");
            }
            System.out.println();

        }
    }
}
