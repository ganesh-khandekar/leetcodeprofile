class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=1;i<32;i++){
            if(n%2==1){
                res++;
            }
            n=n>>1;
            res=res<<1;
        }
        return res;
    }
}