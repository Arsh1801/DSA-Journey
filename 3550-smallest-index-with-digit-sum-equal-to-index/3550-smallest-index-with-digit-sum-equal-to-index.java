class Solution {
    public int smallestIndex(int[] nums) {
        int i = 0;
        int digitsum = 0;
        while (i < nums.length) {
            if (nums[i] > 0) {
                digitsum += nums[i] % 10;
                nums[i] = nums[i] / 10;
            } else if (i == digitsum)
                return i;
            else {
                i++;
                digitsum = 0;
            }
        }
        return -1;
    }
}