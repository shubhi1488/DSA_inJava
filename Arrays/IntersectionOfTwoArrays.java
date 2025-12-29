//brute force-
package Arrays;
import java.util.*;
public class Intersectionoftwoarrays {
    public int[] intersection(int[] nums1,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int[] visited=new int[n2];
        List<Integer> arrList=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j] && visited[j]==0){
                    arrList.add(nums2[j]);
                    visited[j]=1;
                    break;
                }
                else if(nums2[j]>nums1[i]) break;

            }
        }
        int[] ans=new int[arrList.size()];
        for(int k=0;k<arrList.size();k++){
            ans[k]=arrList.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        Intersectionoftwoarrays i1=new Intersectionoftwoarrays();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the first array");
        int n1=sc.nextInt();
        System.out.println("enter size of second array");
        int n2=sc.nextInt();
        System.out.println("enter elements in first array");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter elements in second array");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] intersection=i1.intersection(arr1,arr2);
        System.out.println("intersected list-");
        for(int i=0;i<intersection.length;i++){
            System.out.print(intersection[i]+" ");
        }
        System.out.println();
    }
}
//optimal-
class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        List<Integer>ans=new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]) i++;
            else if(nums2[j]<nums1[i]) j++;
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ansList=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            ansList[k]=ans.get(k);
        }
        return ansList;
    }
}
