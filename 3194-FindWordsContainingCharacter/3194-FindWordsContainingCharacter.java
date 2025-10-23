// Last updated: 10/23/2025, 2:51:16 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> result = new ArrayList<>();

        for (int wordIdx = 0; wordIdx < words.length; wordIdx++) {
            char[] letters = words[wordIdx].toCharArray();
            for (int letterIdx = 0; letterIdx < letters.length; letterIdx++) {
                if (letters[letterIdx] == x) {
                    result.add(wordIdx);
                    break;
                }
            }
        }

        return result;
    }
}