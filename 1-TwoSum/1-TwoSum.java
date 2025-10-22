// Last updated: 10/22/2025, 3:24:56 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) != nums.length) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        int[] result = new int[2];
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }

        throw new IllegalArgumentException();
    }
}