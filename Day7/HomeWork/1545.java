class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");

        for (int i = 2; i <= n; i++) {
            StringBuilder reverse = new StringBuilder();

            for (int j = s.length() - 1; j >= 0; j--) {
                reverse.append(s.charAt(j) == '0' ? '1' : '0');
            }

            s.append('1').append(reverse);
        }

        return s.charAt(k - 1);
    }
}