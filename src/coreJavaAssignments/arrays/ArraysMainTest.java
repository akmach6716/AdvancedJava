package coreJavaAssignments.arrays;
import java.util.Arrays;
import java.util.Random;
public class ArraysMainTest {
    public static void main(String[] args) {
       int [] myIntArray= getRandomArray(10);
        System.out.println(Arrays.toString(myIntArray));
        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        int[] newSecondArray= new int[10];
        Arrays.fill(newSecondArray, 5);
        System.out.println(Arrays.toString(newSecondArray));
        int [] thirdArray= getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
       int [] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        int [] fifthArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(fifthArray));
        int [] sixthArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(sixthArray));
        String [] sarray= {"Sachin", "Ganguly", "Mark", "Rohit", "Kohli"};
        //Arrays.sort(sarray);
        System.out.println(Arrays.toString(sarray));
        System.out.println("searched string is in the position of :  "+Arrays.binarySearch(sarray, "Azhar"));

          }
    private static int[] getRandomArray(int len)
    {
        Random random= new Random();
        int[] newInt= new int[len];
        for(int i=0; i< len; i++)
        {
            newInt[i]= random.nextInt(100);
        }
        return newInt;
    }
}
