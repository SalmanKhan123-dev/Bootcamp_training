public class fourth {

    public static void main(String[] args) {

        int[] nums = {2, 7, 3, 4};

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        System.out.print("Prefix sum is: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}