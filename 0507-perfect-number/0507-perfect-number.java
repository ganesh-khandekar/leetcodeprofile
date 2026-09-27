class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int n = 1;
        int sum = 0,first =0,last=num-1;
        while ((n*n)<= num) {
           if(num%n==0){
            first =n;
            last =num/n;
            sum= sum+ first+last;
           }
           n++;
        }

        sum-=num;
       if(sum==num){
        return true;
       }
        return false;
    }
}