
import java.util.Scanner;
public class peak_element { 
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }

        return left; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex + " with value: " + arr[peakIndex]);
    }
}