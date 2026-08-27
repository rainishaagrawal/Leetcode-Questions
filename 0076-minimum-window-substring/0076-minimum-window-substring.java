class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Deque<Integer> deque = new ArrayDeque<>();
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                continue;
            }
            deque.addLast(right);
            if (map.get(ch) > 0) {
                required--;
            }
            map.put(ch, map.get(ch) - 1);
            while (required == 0) {
                int left = deque.peekFirst();
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) + 1);
                deque.pollFirst();
                if (map.get(leftChar) > 0) {
                    required++;
                }
            }
        }
        return start == -1
                ? ""
                : s.substring(start, start + minLen);
    }
}