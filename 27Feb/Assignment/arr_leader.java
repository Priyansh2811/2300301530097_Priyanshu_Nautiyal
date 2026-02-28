
import java.util.Scanner;
public class arr_leader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Leaders in the array: ");
        printLeaders(arr);
    }
    
    public static void printLeaders(int[] arr) {
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}