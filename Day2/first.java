public class first {

    public static void main(String[] args) {

        int[] nums = {30, 2, 18, 17, 31, 54};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}