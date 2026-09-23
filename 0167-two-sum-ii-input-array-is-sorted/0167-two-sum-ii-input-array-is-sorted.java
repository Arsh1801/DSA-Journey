class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0;
        int l = numbers.length - 1;
        while (f < l) {
            int sum = numbers[f] + numbers[l];
            if (sum == target)
                return new int[] { f + 1, l + 1 };
            else if (sum > target)
                l--;
            else if (sum < target)
                f++;
        }
        return new int[] { -1, -1 };
    }
}