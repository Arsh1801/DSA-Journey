class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])) return true;
            else{
                check.put(nums[i],1);
            }
        }
        return false; 
    }
}