class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length ;
        HashMap<Integer,Integer> alloc = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(i+k<nums.length){
                alloc.put((i+k),nums[i]);
            }else {
                alloc.put(((i+k)-nums.length),nums[i]);
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j]= alloc.get(j);
        }
    }
}