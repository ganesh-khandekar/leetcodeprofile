class Solution {
public:
    int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int way[50];
        way[0]=1;
        way[1]=1;

        for(int i=2;i<=n ;i++){
          way[i]=way[i-1]+way[i-2];
        }
        return way[n];
    }
};