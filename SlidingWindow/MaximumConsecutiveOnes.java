package SlidingWindow;
import java.util.*;
public class MaximumConsecutiveOnes {
    public static int maximumConsecutiveOnes(int[] nums,int k){
        int maxlen=0;
        int l=0,r=0,zeros=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0) zeros++;
            while(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of array");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter the number of zeros to be flipped");
        int k=sc.nextInt();
        System.out.println("maximum consecutive ones are:"+maximumConsecutiveOnes(nums,k));
    }
}
