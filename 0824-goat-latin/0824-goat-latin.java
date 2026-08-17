class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        int index = 1;
        for (String word : words) {
            char first = word.charAt(0);
            if (first == 'a' || first == 'e' || first == 'i' ||
                first == 'o' || first == 'u' ||
                first == 'A' || first == 'E' || first == 'I' ||
                first == 'O' || first == 'U') {
                word = word + "ma";
            } else {
                word = word.substring(1) + first + "ma";
            }
            for (int i = 0; i < index; i++) {
                word = word + "a";
            }
            ans.append(word);
            if (index < words.length) {
                ans.append(" ");
            }
            index++;
        }
        return ans.toString();
    }
}