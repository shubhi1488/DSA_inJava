/*
arr[]={1,2,3,4,5} k=1 arr[]={5,1,2,3,4}
*/
package Arrays;
import java.util.*;

public class RightRotateby1 {
    public void rightRotate(int[] nums){
        int n=nums.length;
        int temp=nums[n-1];
        for(int i=n-2;i>=0;i--){
            nums[i+1]=nums[i];
        }
        nums[0]=temp;
    }

    public static void main(String[] args) {
        RightRotateby1 r1=new RightRotateby1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        r1.rightRotate(arr);
        System.out.println("array after right rotation by 1");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
