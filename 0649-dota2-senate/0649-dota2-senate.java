class Solution {
    public String predictPartyVictory(String senate) {
        ArrayList<Integer> radiant = new ArrayList<>();
        ArrayList<Integer> dire = new ArrayList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.remove(0);
            int d = dire.remove(0);
            if (r < d) {
                radiant.add(r + n);
            } else {
                dire.add(d + n);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}