package Arrays;
import java.util.*;
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums){
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        Map<Integer,Integer> mpp=new HashMap<>();
        int mini=(int)(n/3)+1;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])==mini){
                ls.add(nums[i]);
            }
            if(ls.size()==2) break;
        }
        return ls;
    }

    public static void main(String[] args) {
        MajorityElementII m1=new MajorityElementII();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements of the array");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer>ls=m1.majorityElement(nums);
        for(int x:ls){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
