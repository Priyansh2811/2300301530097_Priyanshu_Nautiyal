import java.util.Scanner;
public class next_alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        char[] arr = new char[n];
        
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next().charAt(0);
        }
        
        System.out.print("Enter the target character: ");
        char target = scan.next().charAt(0);
        
        char result = findNextAlphabet(arr, target);
        if (result == '\0') {
            System.out.println("No next alphabet found for " + target);
        } else {
            System.out.println("The next alphabet after " + target + " is: " + result);
        }
    }
    
    public static char findNextAlphabet(char[] arr, char target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return left < arr.length ? arr[left] : '\0';
    }
}