public class second {

    public static void main(String[] args) {

        int[] nums = {30, 2, 18, 17, 31, 54};

        System.out.println("Reverse Traversal is:");

        for (int i = nums.length-1 ; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}