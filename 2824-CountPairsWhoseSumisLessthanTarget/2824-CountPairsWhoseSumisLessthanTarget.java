// Last updated: 10/23/2025, 3:57:08 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {

                if ((nums.get(i) + nums.get(j) < target) && (i != j)) {
                    System.out.println("i: " + i + " j: " + j);
                    count++;
                }

            }
        }

        return count / 2;        
    }
}