class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int required = s1.length();

        while (right < s2.length()) {
            char c = s2.charAt(right);

            if (count[c - 'a'] > 0) {
                required--;
            }

            count[c - 'a']--;
            right++;

            if (right - left > s1.length()) {
                char leftChar = s2.charAt(left);

                if (count[leftChar - 'a'] >= 0) {
                    required++;
                }

                count[leftChar - 'a']++;
                left++;
            }

            if (required == 0) {
                return true;
            }
        }

        return false;
    }
}