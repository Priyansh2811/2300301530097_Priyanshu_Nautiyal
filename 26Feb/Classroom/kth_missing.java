
import java.util.Scanner;
public class kth_missing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.print("Enter the value of k: ");
        int k = scan.nextInt();
        
        int result = findKthMissing(arr, k);
        System.out.println("The " + k + "th missing number is: " + result);
    }
    
    public static int findKthMissing(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missingCount = arr[mid] - (mid + 1);
            
            if (missingCount < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left + k;
    }
}