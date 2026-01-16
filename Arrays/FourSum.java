package Arrays;
import java.util.*;
public class FourSum {
    public List<List<Integer>>fourSum(int[] nums,int target){
        int n=nums.length;
        Set<List<Integer>>st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hashset=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=nums[i]+nums[j]+nums[k];
                    long fourth=target-sum;
                    if(hashset.contains(fourth)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashset.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(st);
        return ans;

    }

    public static void main(String[] args) {
        FourSum f1=new FourSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter elements in the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target value");
        int target=sc.nextInt();
        List<List<Integer>> ans = f1.fourSum(arr, target);

        // Print the result
        System.out.println("The quadruplets are:");
        for (List<Integer> quad : ans) {
            System.out.print("[");
            for (int num : quad) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }


    }
}
