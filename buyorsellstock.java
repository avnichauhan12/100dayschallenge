public class buyorsellstock {
        public static int maxProfit(int[] prices) {
            int profit=0;
            int buy=prices[0];
            for(int i=1;i<prices.length;i++){
                if(buy<prices[i]){
                    int c=prices[i]-buy;
                    profit=profit+c;
                    buy=prices[i];
                }
                else{
                    buy=prices[i];
                }
            }
            return profit;
        }
        public static void main(String args[]){
             int[] prices={7,1,2,5,6,4};
             int result=maxProfit(prices);
             System.out.println(result);
        }
    }
