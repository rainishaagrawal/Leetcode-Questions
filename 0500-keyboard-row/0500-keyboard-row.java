class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            boolean check = true;
            if (row1.contains("" + word.charAt(0))) {
                for (char c : word.toCharArray()) {
                    if (!row1.contains("" + c)) {
                        check = false;
                        break;
                    }
                }
            } else if (row2.contains("" + word.charAt(0))) {
                for (char c : word.toCharArray()) {
                    if (!row2.contains("" + c)) {
                        check = false;
                        break;
                    }
                }
            } else {
                for (char c : word.toCharArray()) {
                    if (!row3.contains("" + c)) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}