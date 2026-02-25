majority element in array is the element that appears more than n/2 times in the array. Given an array of size n, find the majority element. You may assume that the majority element always exists in the array.
import java.util.Scanner;
public class majority_element {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int majority = majorityElement(nums);
        System.out.println("The majority element is: " + majority);
    }
}