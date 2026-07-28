class Solution {
    public int removeDuplicates(int[] nums) {
  
     int left = 1;
     int right = 1;

     while(right < nums.length){
     
     if(nums[right] != nums[right - 1]){
        nums[left] = nums[right];
        left = left + 1;
     }

     right = right + 1;
     }
       return left;
    }
}