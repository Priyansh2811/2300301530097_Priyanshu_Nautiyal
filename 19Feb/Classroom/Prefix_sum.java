class Prefix_sum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int[] prefix_sum = new int[arr.length];
        
        prefix_sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
        }
        System.out.print("Prefix sum array:");
        for (int i = 0; i < prefix_sum.length; i++) {
            System.out.print(" " + prefix_sum[i]);
        }
    }
}
    


