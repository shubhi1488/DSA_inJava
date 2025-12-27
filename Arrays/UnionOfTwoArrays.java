package Arrays;
import java.util.*;
public class UnionOfTwoArrays {
    public int[] union(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        Set<Integer> st=new TreeSet<>();
        for(int i=0;i<n;i++){
            st.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            st.add(nums2[i]);
        }
        int[] union=new int[st.size()];
        int idx=0;
        for(int it:st){
            union[idx++]=it;
        }
        return union;
    }

    public static void main(String[] args) {
        UnionOfTwoArrays u1=new UnionOfTwoArrays();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of both the arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("enter element  of first array");
        int[] num1=new int[n];
        for(int i=0;i<n;i++){
            num1[i]=sc.nextInt();
        }
        System.out.println("enter element of second array");
        int[] num2=new int[m];
        for(int i=0;i<m;i++){
            num2[i]=sc.nextInt();
        }
        int[] union=u1.union(num1,num2);
        for(int x:union){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
