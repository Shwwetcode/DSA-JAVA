public class Maxequ {
    public static int method(int[] arr, int n) {
        int res = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Traverse the array and find equilibrium points
        for (int i = 0; i < n; i++) {
            // Total sum of elements to the right of the current index
            int rightSum = totalSum - leftSum - arr[i];
            
            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                // Update the result with the maximum equilibrium sum
                res = Math.max(res, leftSum);
            }
            
            // Update left sum for the next iteration
            leftSum += arr[i];
        }

        return (res == Integer.MIN_VALUE) ? -1 : res; // Return -1 if no equilibrium point found
    }

    public static void main(String[] args) {
        int[] arr = {-2,-2, 5, 3, 1, 2, 6, -4, 2,2};
        int n = arr.length;
        System.out.println(method(arr, n)); // Example output
    }
}