package coreJavaAssignments.interviewQuesitionsPractice;
import java.util.HashMap;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Length of the given string is "+LengthOfSubstring("AbcdEfghijklm nop QRSTuvWxyz"));
    }

    public static int LengthOfSubstring(String str) {
        int start = 0;
        int maxLength = 0;
        HashMap<Character , Integer> map= new HashMap<Character, Integer>();
        for(int end=0; end<str.length(); end++)
        {
            char curr= str.charAt(end);
            if (map.containsKey(curr))
            {
                start= Math.max(start, map.get(curr)+1);

            }
            map.put(curr, end);
            maxLength=Math.max(maxLength, end-start+1);
        }

        return maxLength;
    }
}
