package SlidingWindow;
import java.util.*;
public class LongestRepeatingCharacterReplacement {
    public static int longestCharacterReplacement(String s,int k){
        int n=s.length();
        int l=0,r=0;
        int maxlen=0,maxfreq=0;
        int[] hash=new int[26];
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxfreq>k){
                hash[s.charAt(l)-'A']--;
                maxfreq=0;
                for(int i=0;i<26;i++){
                    maxfreq=Math.max(maxfreq,hash[i]);
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        int res=longestCharacterReplacement(s,2);
        System.out.println(res);
    }
}
