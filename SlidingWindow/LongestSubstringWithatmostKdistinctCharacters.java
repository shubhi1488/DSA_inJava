package SlidingWindow;
import java.util.*;
public class LongestSubstringWithatmostKdistinctCharacters {
    public static int LongestSubstring(String s,int k){
        int n=s.length();
        int l=0,r=0,maxlen=0;
        HashMap<Character,Integer>mpp=new HashMap<>();
        while(r<n){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)-1);
            while(mpp.size()>k){
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                if(mpp.get(s.charAt(l))==0){
                    mpp.remove(s.charAt(l));
                }
                l++;
            }
            if(mpp.size()<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        int res=LongestSubstring(s,2);
        System.out.println("Longest substring:"+res);
    }
}
