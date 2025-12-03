int maxProfit(int* prices, int pricesSize) {
   if (pricesSize == 0) return 0;
   int low = prices[0];
    int profit = 0;
    for(int i=0; i<pricesSize; i++){
    int high=prices[i];
    if(prices[i]<low){
        low=prices[i];
    }
    else if(prices[i]-low>profit){
     profit = prices[i] - low;   
      }  
    }
    
      return profit;
    
    }


