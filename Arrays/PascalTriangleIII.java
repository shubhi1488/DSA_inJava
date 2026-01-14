package Arrays;
import java.util.*;
public class PascalTriangleIII {
    public List<List<Integer>>pascalTriangle(int n){
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(generateRow(n));
        }
        return ans;

    }
    private List<Integer> generateRow(int row){
        long ans=1;
        List<Integer>ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int i=1;i<row;i++){
            ans=(ans*(row-i));
            ans=ans/i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static void main(String[] args) {
        PascalTriangleIII p1=new PascalTriangleIII();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number");
        int row=sc.nextInt();
        List<List<Integer>>pascal=p1.pascalTriangle(row);
        for(List<Integer>x:pascal){
            for(int element:x){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
