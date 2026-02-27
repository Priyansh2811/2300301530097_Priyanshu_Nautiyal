
import java.util.Scanner;
public class nearly_sort_arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scan.nextInt();
        int result = searchNearlySorted(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int searchNearlySorted(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
            if (i > 0 && arr[i - 1] == target) {
                return i - 1;
            }
            if (i < arr.length - 1 && arr[i + 1] == target) {
                return i + 1;
            }
        }
        return -1; // Element not found
    }
}