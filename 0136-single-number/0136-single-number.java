class Solution {
    public int singleNumber(int[] nums) {
        int distinct = 0;
        for(int i=0;i<nums.length;i++){
            distinct = distinct ^ nums[i];
        }
        return distinct;
    }
}