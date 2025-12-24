/*
arr[]={1,1,0,0,1,1,1,0,0} maximum consecutive ones:3
*/
package Arrays;
import java.util.*;
public class MaximumConsecutiveOnes {
    public int maxConsecutiveOnes(int[] arr){
        int n=arr.length;
        int count=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        MaximumConsecutiveOnes m1=new MaximumConsecutiveOnes();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("maximum consecutive ones are:"+m1.maxConsecutiveOnes(arr));
    }
}
