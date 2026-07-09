class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                st.push(c[i]);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((c[i] == ')' && top != '(') ||
                    (c[i] == '}' && top != '{') ||
                    (c[i] == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}