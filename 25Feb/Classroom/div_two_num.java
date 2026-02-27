divide two numbers using binary search
import java.util.Scanner;
public class div_two_num {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scan.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scan.nextInt();
        
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }
        
        int quotient = divide(dividend, divisor);
        System.out.println("Quotient: " + quotient);
    }
    
    public static int divide(int dividend, int divisor) {
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        int left = 0, right = dividend;
        int quotient = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * divisor <= dividend) {
                quotient = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return sign * quotient;
    }
}