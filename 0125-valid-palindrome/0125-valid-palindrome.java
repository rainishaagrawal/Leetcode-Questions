class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        char[] c = s.toCharArray();
        while (l < r) {
            if (!Character.isLetterOrDigit(c[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(c[r])) {
                r--;
                continue;
            }
            if (Character.toLowerCase(c[l]) != Character.toLowerCase(c[r])) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}