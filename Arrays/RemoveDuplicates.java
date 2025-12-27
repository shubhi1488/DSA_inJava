package Arrays;
import java.util.*;
public class RemoveDuplicates {
    public int remove(int[] arr){
        int n=arr.length;
        Set<Integer> st=new TreeSet<>();
        for(int val:arr){
            st.add(val);
        }
        int k=st.size();
        int idx=0;
        for(int it:st){
            arr[idx++]=it;
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicates r1=new RemoveDuplicates();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(r1.remove(arr));


    }
}
