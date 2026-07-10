class Solution {
public:
    int mySqrt(int x) {
        int num =0;
        for(long int i =1;(i*i)<=x;i++){
            num=i;
        }
        return num;
    }
};