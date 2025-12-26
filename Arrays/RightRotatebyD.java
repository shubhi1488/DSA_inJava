package Arrays;
import java.util.*;
public class RightRotatebyD {
    public void rightRotatebyd(int[] nums, int k) {
        int n = nums.length;

        // normalize k
        k = k % n;

        // temporary array to store last k elements
        int[] temp = new int[k];

        // store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // shift remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // copy temp elements to beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        RightRotatebyD r1 = new RightRotatebyD();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array before rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("enter the value of k");
        int k = sc.nextInt();

        r1.rightRotatebyd(arr, k);

        System.out.println("array after right rotation");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
