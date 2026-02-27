package SlidingWindow;
import java.util.*;
public class MaximumPointsObtainedFromCards {
    public int maxPoints(int[] cardPoints,int k){
        int lsum=0,rsum=0,maxSum=0;
        for(int i=0;i<k;i++){
            lsum=lsum+cardPoints[i];
            maxSum=lsum;
        }
        int rindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rindex];
            rindex=rindex-1;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumPointsObtainedFromCards obj=new MaximumPointsObtainedFromCards();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the points of the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        System.out.println("maximum points are:");
        System.out.println(obj.maxPoints(arr,k));

    }
}
