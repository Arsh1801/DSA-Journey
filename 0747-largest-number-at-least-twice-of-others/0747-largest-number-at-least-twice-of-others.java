class Solution {
    public int dominantIndex(int[] nums) {
        int large = 0;
        int second = 1;
        if(Math.max(nums[0],nums[1]) == nums[1]){
            large = 1;
            second = 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[large]){
                second = large;
                large = i;
            }else if(nums[i]>nums[second] && nums[i]<nums[large]){
                second = i;
            }
        }
        if(nums[large] >= 2* nums[second]){
            return large ;
        }
        else return -1;
    }
}