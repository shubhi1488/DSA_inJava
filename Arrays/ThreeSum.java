package Arrays;
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        int n=nums.length;
        Set<List<Integer>>tripleSet=new HashSet<>();
        for(int i=0;i<n-2;i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        tripleSet.add(temp);
                    }
                }
            }
        }
            List<List<Integer>>ans=new ArrayList<>(tripleSet);
            return ans;
    }

    public static void main(String[] args) {
        ThreeSum t1=new ThreeSum();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>>ans=t1.threeSum(arr);
        for(List<Integer>triplet:ans){
            System.out.print("[");
            for(int x:triplet){
                System.out.print(x+" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }

}
