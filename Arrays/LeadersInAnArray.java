package Arrays;
import java.util.*;
public class LeadersInAnArray {
    public List<Integer>leaders(int[] nums){
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(nums[j]>=nums[i]){
                    leader=false;
                    break;
                }
            }
            if(leader) ans.add(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        LeadersInAnArray l1=new LeadersInAnArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ans=l1.leaders(arr);
        for(int leader:ans){
            System.out.print(leader+" ");
        }
        System.out.println();
     }
}
