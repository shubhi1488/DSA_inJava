/*
arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5} majority element:5
*/
package Arrays;
import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] nums){
        int n=nums.length;
        int cnt=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(el==nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement m1=new MajorityElement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements of the array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("majority element is:"+m1.majorityElement(nums));
    }
}
