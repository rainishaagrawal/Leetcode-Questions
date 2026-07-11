class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character> st = new Stack<>();
        for (char ch : num.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String ans = sb.substring(i);
        return ans.isEmpty() ? "0" : ans;
    }
}