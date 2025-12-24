/*
arr[]={7,7,2,2,10,10,10} second largest element:7
*/

package Arrays;
import java.util.*;
public class SecondLargestElement {
    public int secondLargest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        if(n<2){
            return -1;
        }
        int largest=arr[n-1];
        int secondl=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondl=arr[i];
                break;
            }
        }
        return secondl;
    }

    public static void main(String[] args) {
        SecondLargestElement s1=new SecondLargestElement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second largest elements is:"+s1.secondLargest(arr));
    }
}
