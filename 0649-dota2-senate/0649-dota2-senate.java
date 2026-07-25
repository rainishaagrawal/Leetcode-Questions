class Solution {
    public String predictPartyVictory(String senate) {
        return simulateRec(senate.toCharArray(), 0, 0) ? "Radiant" : "Dire";
    }
    private static boolean simulateRec(char[] s, int rBan, int dBan) {
        int r = 0, d = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'R') {
                if (dBan > 0) {
                    dBan--;
                    s[i] = 0;
                } else {
                    r++;
                    rBan++;
                }
            } else if (s[i] == 'D') {
                if (rBan > 0) {
                    rBan--;
                    s[i] = 0;
                } else {
                    d++;
                    dBan++;
                }
            }
        }
        if (r == 0) return false;
        if (d == 0) return true;
        return simulateRec(s, rBan, dBan);
    }
}