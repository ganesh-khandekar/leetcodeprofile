class Solution {
    List<List<Integer>> res =new ArrayList<>();
    void  combinationSum1(int[] candidates, int target,   List<Integer> arr,int k){
         for(int i=k;i<candidates.length;i++){
            if(0==target){
                res.add(new ArrayList<>(arr));
                return;
            }if(0>target){
                continue;
            }
            arr.add(candidates[i]);
            combinationSum1(candidates,target-candidates[i], arr,i);
            arr.removeLast();
         }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer> arr = new ArrayList<>();
         int i=0;
        combinationSum1(candidates,target, arr,i);
         return res;
    }
}