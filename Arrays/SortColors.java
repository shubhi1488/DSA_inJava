package Arrays;
import java.util.*;
public class SortColors {
    public void sort(int[] nums){
        int n=nums.length;
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) cnt0++;
            else if(nums[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++) nums[i]=0;
        for(int i=cnt0;i<cnt0+cnt1;i++) nums[i]=1;
        for(int i=cnt0+cnt1;i<n;i++) nums[i]=2;
    }

    public static void main(String[] args) {
        SortColors s1=new SortColors();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the list");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array after sorting");
        s1.sort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
