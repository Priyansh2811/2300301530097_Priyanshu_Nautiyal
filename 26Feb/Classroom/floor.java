
import java.util.Scanner;
public class floor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.print("Enter the value x: ");
        int x = scan.nextInt();
        
        int result = findFloor(arr, x);
        if (result == Integer.MIN_VALUE) {
            System.out.println("No floor found for " + x);
        } else {
            System.out.println("Floor of " + x + " is: " + result);
        }
    }
    
    public static int findFloor(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int floor = Integer.MIN_VALUE;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return floor;
    }
}