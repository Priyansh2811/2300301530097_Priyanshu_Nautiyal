import java.util.Scanner;
public class koko875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        return left; 
    }

    private static boolean canEatAll(int[] piles, int h, int speed) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + speed - 1) / speed; // Equivalent to Math.ceil(pile / speed)
        }
        return hoursNeeded <= h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of piles:");
        int n = scanner.nextInt();
        int[] piles = new int[n];

        System.out.println("Enter the number of bananas in each pile:");
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of hours Koko has:");
        int h = scanner.nextInt();

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed Koko needs: " + result);
    }
}