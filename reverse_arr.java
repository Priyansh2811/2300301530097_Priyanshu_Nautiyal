reversal of an array in java
import java.util.Scanner;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}