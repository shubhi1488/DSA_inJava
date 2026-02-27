package SlidingWindow;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacter {
    public static int longestSubstring(String s){
        int n=s.length();
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int l=0,r=0,maxLen=0;
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            int len=r-l+1;
            maxLen=Math.max(len,maxLen);
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        System.out.println("maximum length of longest substring");
        System.out.println(longestSubstring(s));
    }
}
