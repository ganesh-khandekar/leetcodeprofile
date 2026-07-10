class Solution {
public:
    bool isHappy(int n,int sum =0) {
        if (n==1||n==7){
            return true;
        }else if((n==0)||(n>=2&&n<=9)){
            return false;
        }
        while(n>0){
            sum =sum +((n%10)*(n%10));
            n=n/10;
        }
        return isHappy(sum,0);
    }
};