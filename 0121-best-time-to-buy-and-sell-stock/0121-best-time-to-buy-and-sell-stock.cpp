class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxprofits=0;
        int minprofits=prices[0];
        for(int i=1;i<prices.size();i++){
            if(minprofits>prices[i]){
              minprofits=prices[i];
            }else if(maxprofits<prices[i]-minprofits){
                maxprofits=prices[i]-minprofits;
            }
        }
        return maxprofits;
    }
};