// Last updated: 10/22/2025, 3:24:55 PM
class Solution {
    public int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}