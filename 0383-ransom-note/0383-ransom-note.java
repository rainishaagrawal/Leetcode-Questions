class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        int count = n;
        char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mag[i] == ransom[j]) {
                    count--;
                    ransom[j] = '#'; 
                    break;
                }
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}