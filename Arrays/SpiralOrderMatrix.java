package Arrays;
import java.util.*;
public class SpiralOrderMatrix {
    public List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,left=0,right=m-1,bottom=n-1;
        while(top<=bottom && left<=right){
            //left->right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top->bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right->left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom->top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SpiralOrderMatrix s1=new SpiralOrderMatrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("enter the matrix");
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> ans=s1.spiralMatrix(matrix);
        for(int x:ans){
            System.out.print(x+",");
        }
        System.out.println();
    }
}
