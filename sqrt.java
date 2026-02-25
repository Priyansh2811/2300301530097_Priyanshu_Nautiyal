
import java.util.Scanner;
public class sqrt { 
    public static int mySqrt(int x) {
        if (x < 2) {
            return x; 
        }

        int left = 1;
        int right = x / 2; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid; 
            } else if (midSquared < x) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return right; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int x = scanner.nextInt();

        int result = mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}