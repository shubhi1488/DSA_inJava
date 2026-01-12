package Arrays;
import java.util.*;
public class PascalTriangle1 {
    private int nCr(int n,int r){
        if(r>n-r) r=n-r;
        if(r==1) return n;
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public int pascal(int r,int c){
        return nCr(r-1,c-1);
    }

    public static void main(String[] args) {
        PascalTriangle1 p1=new PascalTriangle1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int r=sc.nextInt();
        System.out.println("enter the column");
        int c=sc.nextInt();
        int ans=p1.pascal(r,c);
        System.out.println("element in the rth row and cth column is:"+ans);

    }
}
