class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> two = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
                int second = target - nums[i];
                if(two.containsKey(second)){
                    return new int[]{ i, two.get(second)};
                }
                two.put(nums[i],i);

        }
        return new int[]{};
    }
}