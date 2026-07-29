class Solution {
    private List<List<Integer>> res =new ArrayList<>();
    void travel(int[] nums ,List<Integer> arr,int k){
        if(arr.size()==nums.length){
            res.add(new ArrayList(arr));
            return;
        }
        for(int i=k;i<nums.length;i++){
            if(arr.contains(nums[i])){
                continue;
            }
            arr.add(nums[i]);
            travel(nums,arr,0);
            arr.removeLast();
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        travel(nums,new ArrayList<>(),0);
        return res;
    }
}
