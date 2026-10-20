
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = palindrome(s, i, i);
            String even = palindrome(s, i, i + 1);

            if (odd.length() > ans.length()) {
                ans = odd;
            }

            if (even.length() > ans.length()) {
                ans = even;
            }
        }

        return ans;
    }

    String palindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length()
                && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start + 1, end);
    }
}
