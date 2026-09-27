class Solution {
    public int maxProfit(int[] prices) {

   int l = 0;
   int r = 1;
   int maxPrice = 0;

   while(r < prices.length){
   
   if(prices[r] > prices[l]){
    int s = prices[r] - prices[l];
    maxPrice = Math.max(maxPrice, s);
   }else {
    l = r;
   }
   r = r + 1;
   }
      return maxPrice;  
    }
}
