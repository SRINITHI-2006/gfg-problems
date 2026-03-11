class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int maxs=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
        }
        maxs=Math.max(maxs,count);
        if(nums[i]==0){
          count=0;
         }
       } 
       return maxs;
    }
}
