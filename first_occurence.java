first occurence oftarget 4 in the arr {1 2 3 4 4 4 4 5 6 }in binary search
import java.util.Scanner;
public class first_occurence {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Store the index of the found target
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return result; // Return the index of the first occurrence or -1 if not found
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

        System.out.println("Enter the target element to find its first occurrence:");
        int target = scanner.nextInt();

        int index = firstOccurrence(arr, target);
        if (index != -1) {
            System.out.println("The first occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}