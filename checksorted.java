
import java.util.Scanner;
public class checksorted {
    public static boolean hasPairWithSum(int[] arr, int sum) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == sum) {
                return true;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the sum to find:");
        int sum = scanner.nextInt();

        boolean result = hasPairWithSum(arr, sum);
        System.out.println(result);
    }
}

