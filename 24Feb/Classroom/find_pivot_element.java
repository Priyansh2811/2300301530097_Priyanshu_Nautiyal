
import java.util.Scanner;
public class find_pivot_element {
    public static int findPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1; 
            } else {
                right = mid; 
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

        int pivotIndex = findPivot(arr);
        System.out.println("Pivot element is at index: " + pivotIndex + " with value: " + arr[pivotIndex]);
    }
}