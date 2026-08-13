// Right rotate an array
public class second {

    public static void main(String[] args) {

        int[] nums = {1, 3, 7, 11, 13, 2, 8};

        System.out.println("Subarrays are:");

        for (int start = 0; start < nums.length; start++) {

            for(int end=1; end<nums.length;end++){
            for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();

            }

        
        }

        
    }
}