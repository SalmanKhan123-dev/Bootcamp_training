public class Third {

    public static void floorCeiling(int[] nums, int target) {
        int floor = -1;
        int ceil = -1;

        for (int i = 0; i < nums.length; i++) {

            // Find the greatest value less than or equal to target
            if (nums[i] <= target) {
                floor = Math.max(floor, nums[i]);
            }

            // Find the smallest value greater than or equal to target
            if (nums[i] >= target) {
                if (ceil == -1 || nums[i] < ceil) {
                    ceil = nums[i];
                }
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceiling = " + ceil);
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 10};
        int target = 5;

        floorCeiling(nums, target);
    }
}