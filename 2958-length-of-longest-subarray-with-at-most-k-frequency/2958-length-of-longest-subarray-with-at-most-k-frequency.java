class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int l = 0, ans = 0;
        for (int r = 0; r < nums.length; r++) {
            if (m.containsKey(nums[r]))
                m.put(nums[r], m.get(nums[r]) + 1);
            else
                m.put(nums[r], 1);
            while (m.get(nums[r]) > k) {
                m.put(nums[l], m.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}