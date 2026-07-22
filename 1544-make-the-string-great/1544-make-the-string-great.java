class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!st.isEmpty() && Math.abs(st.peek() - ch[i]) == 32) {
                st.pop();
            } else {
                st.push(ch[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            sb.append(st.get(i));
        }
        return sb.toString();
    }
}