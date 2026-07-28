class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) return s;
        char[] c = s.toCharArray();
        int n = c.length;
        Arrays.sort(c, 0, n/2);
        for(int i=0; i<n/2; i++){
            c[n-i-1] = c[i];
        }
        return new String(c);
    }
}