# Last updated: 10/28/2025, 11:17:20 PM
class Solution(object):
    def twoSum(self, nums, target):
        # nums : list[int]
        # target : integer
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i
        return []

# class Solution {
#     public int[] twoSum(int[] nums, int target) {

#         for (int i = 0; i < nums.length; i++) {
#             if ((i + 1) != nums.length) {
#                 for (int j = i + 1; j < nums.length; j++) {
#                     if ((nums[i] + nums[j]) == target) {
#                         int[] result = new int[2];
#                         result[0] = i;
#                         result[1] = j;
#                         return result;
#                     }
#                 }
#             }
#         }

#         throw new IllegalArgumentException();
#     }
# }