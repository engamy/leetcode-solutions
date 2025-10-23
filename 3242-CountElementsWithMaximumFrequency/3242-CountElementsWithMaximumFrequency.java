// Last updated: 10/23/2025, 2:26:24 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency
        int maxFreq = 0;
        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count how many elements have that maximum frequency,
        // and multiply by maxFreq to get total occurrences
        int result = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                result += f;
            }
        }

        return result;
    }
}
