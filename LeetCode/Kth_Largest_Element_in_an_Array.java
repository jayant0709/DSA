public class Kth_Largest_Element_in_an_Array {
    static public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums, i);
        }
        int n = nums.length;
        for (int i = n - 1; i > n - k; i--) {
            delete(nums, i);
        }
        return nums[0];
    }

    static void insert(int[] nums, int n) {
        int i = n;
        int temp = nums[i];
        while (i >= 1 && nums[(i - 1) / 2] < temp) {
            nums[i] = nums[(i - 1) / 2];
            i = (i - 1) / 2;
        }
        nums[i] = temp;
    }

    static void delete(int[] A, int n) {
        int i, j, temp, val;
        val = A[0];
        A[0] = A[n];
        A[n] = val;
        i = 0;
        j = 1;
        while (j <= n - 1) {
            if (j < n - 1 && A[j + 1] > A[j])
                j = j + 1;
            if (A[i] < A[j]) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i = j;
                j = 2 * j + 1;
            } else
                break;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;
        int sol = findKthLargest(nums, k);
        System.out.println(sol);
    }
}
