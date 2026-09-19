class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]/10 > 0 && nums[i]/10 < 10){
                even++;
            }
            else if(nums[i]/1000>0 && nums[i]/1000<10){
                even++;
            }
            else if(nums[i] == 100000){
                even++;
            }
        }
        return even;
    }
}