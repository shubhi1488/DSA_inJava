package Arrays;
import java.util.*;
public class KadaneAlgorithm {
    public int maxSum(int[] nums){
        int n=nums.length;
        long maxi=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        return (int)maxi;
    }

    public static void main(String[] args) {
        KadaneAlgorithm k1=new KadaneAlgorithm();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum sum is:"+k1.maxSum(arr));
    }
}
