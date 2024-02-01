public class Find_The_Duplicate_Element {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        Find_The_Duplicate_Element solution = new Find_The_Duplicate_Element();
        int duplicate = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicate);
    }

    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1]++;
            if (arr[nums[i] - 1] == 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
