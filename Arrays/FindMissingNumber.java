/*
arr[]={1,2,4,5} n=5 o/p-3
*/
package Arrays;
import java.util.*;
public class FindMissingNumber {
    public int missingNumber(int[] arr){
        int n=arr.length;
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindMissingNumber f1=new FindMissingNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("element which is not present:"+f1.missingNumber(arr));
    }
}
