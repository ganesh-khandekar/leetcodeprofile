class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)return;
        int max =nums.length-1,j,i;
        j=max;
        i=max;

        while(max>0 && nums[max]<=nums[max-1]){
            max--;
        }
        max--;
        while(max>=0 && i>=0 && nums[i]<=nums[max] ){
            i--;
        }
        if(max>=0 && i>=0){
            int temp = nums[i];
            nums[i] =nums[max];
            nums[max] = temp;
        }
        i= max+ 1;
       
        while(i<j ){
            int temp = nums[i];
            nums[i] =nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}