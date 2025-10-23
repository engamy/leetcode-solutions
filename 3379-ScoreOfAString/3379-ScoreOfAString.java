// Last updated: 10/23/2025, 2:51:14 PM
class Solution {
    public int scoreOfString(String s) {
        char[] letters = s.toCharArray();
        ArrayList<Integer> letterVals = new ArrayList<>();
        for (char c : letters) {
            letterVals.add((int)c);
        }

        System.out.println(letters);
        System.out.println(letterVals);

        int score = 0;


        for (int i = 0; i < letterVals.size() - 1; i++) {
            int numA = Math.abs(letterVals.get(i));
            int numB = Math.abs(letterVals.get(i+1));
            int difference = Math.abs(numA-numB);
            score += difference;
        }


        return score;
    }
}