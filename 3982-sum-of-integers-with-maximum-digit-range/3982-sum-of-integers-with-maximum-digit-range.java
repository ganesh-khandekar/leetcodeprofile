class Solution {
    int max =0;
    public int maxDigitRange(int[] nums) {
        int[] arr =new int[nums.length];
        
        for(int i=0; i<nums.length ;i++){
           int  output=max(nums[i]);
            arr[i]=output;
            if(max<=output){
                max=output;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(max==  arr[i]){
                
             sum=sum +nums[i];   
            }
            
        }
        return sum;
        
    }
    int max(int num){
        int small=0;
        int large=0;
         small=num%10;
        large=num%10;
        while(num>0){
            if(small>(num%10)){
                small=num%10;
            }
            if(large<(num%10)){
                large=num%10;
            }
            num= num/10;
        }
    return (large-small);
    }
}