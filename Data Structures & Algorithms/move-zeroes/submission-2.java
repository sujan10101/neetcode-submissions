class Solution {
    public void moveZeroes(int[] nums) {
   int start = 0;
   int fast = 0;

   while(fast < nums.length){
     
     if(nums[fast] != 0){
        int temp = nums[start];
        nums[start] = nums[fast];
        nums[fast] = temp;
        start++;
     }
     fast++;
   }
 
    }
}