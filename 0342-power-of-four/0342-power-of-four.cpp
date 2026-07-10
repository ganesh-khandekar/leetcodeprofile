class Solution {
public:
    bool isPowerOfFour(int n) {
         if (n==0){
            return false;
        }else if (n==4||n==1){
            return true;
        }else if(n%4==0){
            n=n/4;
            return isPowerOfFour(n);
        }
            return false;
        
    }
};