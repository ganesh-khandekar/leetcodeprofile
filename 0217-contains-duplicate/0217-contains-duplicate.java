class Solution {
    public boolean containsDuplicate(int[] nums) {
         if(nums.length==0){
            return false;
        }
        HashSet<Integer> flag = new HashSet<>();

        for(int i=0; i<nums.length;i++){
            if(!flag.contains(nums[i])){
                flag.add(nums[i]);
            }else{
                return true;
            }
        }
        return false ;
   
    }
}