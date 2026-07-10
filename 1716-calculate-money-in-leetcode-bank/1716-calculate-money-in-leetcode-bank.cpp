class Solution {
public:
   int findsum(int n, int adder = 1, int week = 1, int day = 1) {

        if (n >= 1) {
            if (day % 8 != 0) {
                return adder + findsum(n - 1, adder + 1, week, day + 1);
            } else if (day % 8 == 0) {
                week++;
                adder = week;
                day = 1;
                return adder + findsum(n - 1, adder + 1, week, day + 1);
            }
        } 
            return 0;
        
    }
    int totalMoney(int n) {
        int sum = 0;
        sum = sum + findsum(n);
        return sum;
    }
};