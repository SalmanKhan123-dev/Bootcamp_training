import java.util.ArrayList;
import java.util.List;

class fifth{ // Brute force

    public int findNumbers(int[] nums) {

        List<String> list = new ArrayList<>();

        for (int num : nums) {

            if (String.valueOf(num).length() % 2 == 0) {
                list.add(String.valueOf(num));
            }
        }

        return list.size();
    }
}