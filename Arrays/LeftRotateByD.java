/*
arr[]={1,2,3,4,5,6,7} k=3  arr[]={4,5,6,7,1,2,3}
*/

package Arrays;
import java.util.*;

public class LeftRotatebyd {
    public void leftRotateByd(int[] nums,int d){
        //length of the array-
        int n=nums.length;
        //sort the d-
        d=d%n;
        //store the elements which needs to be rotated in temporary array
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }
        //shift the rest of the elements
        for(int i=d;i<n;i++){
            nums[i-d]=nums[i];
        }
        //now put the elements of temp array back to its original array at last
        for(int i=n-d;i<n;i++){
            nums[i]=temp[i-(n-d)];
        }

    }

    public static void main(String[] args) {
        LeftRotatebyd l1=new LeftRotatebyd();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        l1.leftRotateByd(arr,k);
        System.out.println("array after left rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
