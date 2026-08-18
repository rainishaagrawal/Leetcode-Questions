class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : banned) {
            map.put(word, -1);
        }
        String[] arr = paragraph.toLowerCase().split("[ !?',;.]+");
        for (String word : arr) {
            if (map.containsKey(word) && map.get(word) == -1) {
                continue;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String ans = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                ans = word;
            }
        }
        return ans;
    }
}