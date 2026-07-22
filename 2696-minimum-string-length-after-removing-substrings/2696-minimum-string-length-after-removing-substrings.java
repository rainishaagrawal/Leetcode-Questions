class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!st.isEmpty() && st.peek() == 'A' && ch[i] == 'B') {
                st.pop();
            }
            else if (!st.isEmpty() && st.peek() == 'C' && ch[i] == 'D') {
                st.pop();
            }
            else {
                st.push(ch[i]);
            }
        }
        return st.size();
    }
}