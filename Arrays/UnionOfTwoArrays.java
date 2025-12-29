//Brute Force-
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

//Optimal- Two pointer approach
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
       List<Integer>UnionList=new ArrayList<>();
       int i=0,j=0;
       int n=nums1.length;
       int m=nums2.length;
       while(i<n && j<m){
        if(nums1[i]<=nums2[j]){
            if(UnionList.isEmpty() || UnionList.get(UnionList.size()-1)!=nums1[i]){
                UnionList.add(nums1[i]);
            }
            i++;
        }
        else{
            if(UnionList.isEmpty() || UnionList.get(UnionList.size()-1)!=nums2[j]){
                UnionList.add(nums2[j]);
            }
            j++;
        }
       }
       while(i<n){
        if(UnionList.isEmpty() || UnionList.get(UnionList.size()-1)!=nums1[i]){
            UnionList.add(nums1[i]);
        }
        i++;
       }
       while(j<m){
        if(UnionList.isEmpty() || UnionList.get(UnionList.size()-1)!=nums2[j]){
            UnionList.add(nums2[j]);
        }
        j++;
       }
       int[] union=new int[UnionList.size()];
       for(int k=0;k<UnionList.size();k++){
        union[k]=UnionList.get(k);
       }
       return union;
    }
}
