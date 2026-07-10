class Solution {
public:
    int numTrees(int n) {
        if(n==1||n==0){
            return 1; 
        }else if(n==2){
            return 2;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum =sum+(numTrees(n-1-i)*numTrees(i));
        }
        return sum;
    }
};