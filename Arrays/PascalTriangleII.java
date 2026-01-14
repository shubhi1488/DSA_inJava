package Arrays;
import java.util.*;
public class PascalTriangleII {
    public int[] pascal(int r){
        int[] ans=new int[r];
        ans[0]=1;
        for(int i=1;i<r;i++){
            ans[i]=(ans[i-1]*(r-i))/i;
        }
        return ans;
    }

    public static void main(String[] args) {
        PascalTriangleII p1=new PascalTriangleII();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number");
        int r=sc.nextInt();
        int[] ans=p1.pascal(r);
        for(int x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
