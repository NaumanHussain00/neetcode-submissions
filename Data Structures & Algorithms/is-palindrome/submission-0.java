
class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while (first < last) {

            if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
                continue;
            }

            // Compare characters without case sensitivity
            if (Character.toLowerCase(s.charAt(first)) !=
                Character.toLowerCase(s.charAt(last))) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
