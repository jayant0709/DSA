import java.util.Arrays;

public class Divide_Array_into_Arrays_with_Max_Difference {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {1, 4, 2, 7, 6, 9, 3, 8, 5, 10, 13, 12, 11, 16, 14, 15};
        int k = 3;
        Divide_Array_into_Arrays_with_Max_Difference solution = new Divide_Array_into_Arrays_with_Max_Difference();
        int[][] result = solution.divideArray(nums, k);
        System.out.println(Arrays.deepToString(result));
    }

    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int result[][] = new int[0][0];
        int arr[][] = new int[n / 3][3];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < n; i += 3) {
            if (i + 2 < n && nums[i + 2] - nums[i] <= k) {
                arr[j][0] = nums[i];
                arr[j][1] = nums[i + 1];
                arr[j][2] = nums[i + 2];
                j++;
            }
        }
        if (j == n / 3) {
            return arr;
        }
        return result;
    }
}
