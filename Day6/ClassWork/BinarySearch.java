public class BinarySearch {
    public static void main(String args[]) {

        int arr[] = {3, 8, 11, 13, 15};
        int target = 13;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Target is at index: " + mid);
                break;

            } else if (arr[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
    }
}