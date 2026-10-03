import java.util.*;

class Solution {
   Integer find( HashMap<Integer ,Integer> check,int num ){
    int val =Integer.MIN_VALUE;
    int k= num;
     for(Integer key : check.keySet()){
        if(val<=check.get(key)){
            val = check.get(key);
            k= key;
        }
     }
     check.remove(k);
     return k;
   }
    public int[] topKFrequent(int[] nums, int k) {
        

        int[] num = new int[k];
        HashMap<Integer ,Integer> check = new HashMap<>();
        HashSet<Integer> temp = new HashSet<>();
        
        for( int i=0; i<nums.length; i++){
            if(!check.containsKey(nums[i])){
               temp.add(nums[i]);
                check.put( nums[i],1);
            }else {
                check.put( nums[i],check.get(nums[i])+1);
            }

        }  
       
   System.out.println ( check);
        for(int i=0; i<k ; i++){
            num[i] = find(check,nums[0]);
        }
        return num;

      


    }
}