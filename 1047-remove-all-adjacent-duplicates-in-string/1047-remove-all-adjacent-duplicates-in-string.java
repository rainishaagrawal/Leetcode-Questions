class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!st.isEmpty() && st.peek() == c[i]) {
                st.pop();
            } else {
                st.push(c[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}