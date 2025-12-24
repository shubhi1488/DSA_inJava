/*
arr[]={1,2,3,4,5} left rotate=1 arr[]={2,3,4,5,1}
*/
package Arrays;
import java.util.*;

public class LeftRotateArraybyOne {
    public  void leftRotate(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    public static void main(String[] args) {
        LeftRotateArraybyOne l1=new LeftRotateArraybyOne();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        l1.leftRotate(arr);
        System.out.println("array after left rotation by 1");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
