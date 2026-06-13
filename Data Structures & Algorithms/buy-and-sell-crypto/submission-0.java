class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestPriceToBuy = 101;
        for(int i = 0; i< prices.length; i++){
            int currentPrice = prices[i];
            if(currentPrice < bestPriceToBuy){
                bestPriceToBuy = currentPrice;
            }
            int currentProfit = currentPrice - bestPriceToBuy;
            maxProfit = Math.max(currentProfit,maxProfit);
        }
        return maxProfit;
    }
}
