class Solution {
    public int[] twoSum(int[] numbers, int t) {
        int i = 0 , j = numbers.length-1 ;
        Boolean flag =  false; 

        while(i < j){
            int val = numbers[i] + numbers[j];
            if(val == t){
                flag=true;
                break;
            }else if (val > t){
                j--;
            }else{
                i++;
            }
        }
        if(flag){
            int[] n ={i+1,j+1};
            return n;
        }
        int[] n ={};
        return n;
    
    }
}