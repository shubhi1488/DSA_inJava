package Arrays;
import java.util.*;
public class RepeatingMissingNumber {
    public int[] findMissingRepeating(int[] nums){
        int n=nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            if(hash[i]==2) repeating=i;
            else if(hash[i]==0) missing=i;
            if(repeating!=-1 && missing!=-1) break;
        }
        return new int[]{repeating,missing};
    }

    public static void main(String[] args) {
        RepeatingMissingNumber r1=new RepeatingMissingNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements in the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=r1.findMissingRepeating(arr);
        for(int x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
