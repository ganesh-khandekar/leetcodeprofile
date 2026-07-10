class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int trans;
        int k=0;
        for(int i=0;i<nums.size();i++) {
            for(int j=nums.size()-1;j>0;j--) {
               
               if ((nums[i]==val) && (nums[j]!=val)&&(i<j)) {
                trans=nums[j];
                nums[j]=nums[i];
                nums[i]=trans;
                
               }    
            }
            if(nums[i]!=val) {
                k++;
            }       
        } 
       
        return k;   
    }
};