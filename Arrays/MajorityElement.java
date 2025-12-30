//Brute force-
package Arrays;
import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]) cnt++;
            }
            if(cnt>(n/2)) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement m1=new MajorityElement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("majority element is:"+m1.majorityElement(arr));
    }
}
