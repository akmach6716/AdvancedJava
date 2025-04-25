package coreJavaAssignments.interviewQuesitionsPractice;

public class ReverseLettersinString {
    public static void main(String[] args) {
        System.out.println(reverseLetters("rt243 ,io898 @89jk00"));
        System.out.println(reverseLetters("rt243"));
        System.out.println(reverseLetters("rt243 ,io898 @89jkoo"));

    }

    public static String reverseLetters(String str)
    {
        char [] charArray=str.toCharArray();
        int left=0;
       int right= charArray.length-1;

       while(left<right)
       {
           if(!Character.isLetter(charArray[left]))
           {
              left++;
           }else if (!Character.isLetter(charArray[right]))
           {
               right--;
           }else
           {
               char temp= charArray[left];
               charArray[left]=charArray[right];
               charArray[right]=temp;
               left++;
               right--;
           }

       }

       return new String(charArray);
    }
}
