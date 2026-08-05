class Solution {
    public int dominantIndex(int[] nums) {
        int large = 0;
        int second = 1;
        if(nums[large]<nums[second]){
            int temp = large;
            large = second;
            second = temp;
        }
        for(int i = 0; i< nums.length; i++){
            if(nums[i]>nums[second] && nums[i]<nums[large]){
                second = i;
            }else if(nums[i]>nums[large]){
                second = large;
                large = i;
            }
        }
        if(nums[large]>= (2 * nums[second])){
            return large;
        }
        else return -1;
    }
}