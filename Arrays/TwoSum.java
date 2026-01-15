package Arrays;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int n=nums.length;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSum t1=new TwoSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target value");
        int target=sc.nextInt();
        int[] ans=t1.twoSum(arr,target);
        for(int x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
