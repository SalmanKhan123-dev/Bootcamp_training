public class Second {
    public static int countZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 0, 0, 0};

        int result = countZeroes(nums);

        System.out.println("Number of zeroes = " + result);
    }
}