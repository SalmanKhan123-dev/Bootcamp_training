// Right rotate an array
public class first {

    public static void main(String[] args) {

        int[] nums = {1, 3, 7, 11, 13, 2, 8};

        int k = 2;

        System.out.println("Right rotated array is");

        k = k % nums.length;

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int indx = (i + k) % nums.length;

            temp[indx] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

            nums[i] = temp[i];

            System.out.print(nums[i] + " ");
        }
    }
}