class Solution {
    public boolean check(int[] nums) {
        int check = 0;
        int crosscheck = 0;
        if(nums.length<3)return true;
        for(int i =1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                check++;
                if(check == 1){
                    crosscheck = i;
                }
            }
        }
        for(int j = 0; j<crosscheck;j++){
            if(nums[j]<nums[nums.length - 1]){
                check++;
            }
        }
        if(check <=1){
            return true;
        }else return false;
    }
}