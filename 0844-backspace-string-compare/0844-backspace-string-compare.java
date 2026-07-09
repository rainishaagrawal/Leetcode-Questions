class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != '#') {
                st1.push(c1[i]);
            } else {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }
        }
        for (int i = 0; i < c2.length; i++) {
            if (c2[i] != '#') {
                st2.push(c2[i]);
            } else {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            }
        }
        if (st1.equals(st2))
            return true;
        return false;
    }
}