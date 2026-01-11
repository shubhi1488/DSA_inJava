//brute force solution
package Arrays;
import java.util.*;
public class RearrangeArrayBySign {
    public int[] rearrange(int[] arr){
        int n=arr.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        RearrangeArrayBySign r1=new RearrangeArrayBySign();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter element of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before rearranging");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("array after rearranging");
        int[] ans=r1.rearrange(arr);
        for(int x:ans){
            System.out.print(x+",");
        }
        System.out.println();
    }
}
//optimal solution-
class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       int posIndex=0,negIndex=1;
       for(int i=0;i<n;i++){
        if(nums[i]<0){
            ans[negIndex]=nums[i];
            negIndex+=2;
        }
        else{
            ans[posIndex]=nums[i];
            posIndex+=2;
        }
       }
       return ans;
    }
}
