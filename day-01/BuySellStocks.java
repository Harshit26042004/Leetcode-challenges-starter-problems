public class BuySellStocks {
    public static void main(String[] args) {
        System.out.println("Input for main");
    }

        public int maxProfit(int[] prices) {
            int buy = prices[0];
            int maxprofit = 0;
            for(int i=1;i<prices.length;i++){
                if(buy>prices[i]){
                    buy = prices[i];
                }
                else if(prices[i]-buy>maxprofit){
                    maxprofit = prices[i]-buy;
                }
            }
            return maxprofit;


    }
}
