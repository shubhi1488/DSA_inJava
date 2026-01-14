package Arrays;
import java.util.*;
public class RotateArrayBy90 {
    public void rotate(int[][]matrix){
        int n=matrix.length;
        int[][] rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            System.arraycopy(rotated[i],0,matrix[i],0,n);
        }
    }

    public static void main(String[] args) {
        RotateArrayBy90 r1=new RotateArrayBy90();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of matrix");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("enter elements in the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //matrix before rotation
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //matrix after rotation
        r1.rotate(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
