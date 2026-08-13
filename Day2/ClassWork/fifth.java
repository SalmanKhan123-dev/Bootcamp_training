public class fifth {

    public static void main(String[] args) {

        int[] nums = {2, 7, 3, 4};

        // Calculate suffix sum
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i] = nums[i] + nums[i + 1];
        }

        System.out.print("Suffix sum is: ");

        // Print suffix sum array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}