class Solution {
    public boolean check(int[] nums) {
        HashMap<Character, Integer> check = new HashMap<>();
        check.put('t', 0);
        check.put('f', 0);
        if (nums[0] < nums[nums.length - 1]) {
            check.put('f', check.get('f') + 1);

        } else {
            check.put('t', check.get('t') + 1);

        }
        
        System.out.println("t : "+check.get('t'));
        System.out.println("f : "+check.get('f'));
        System.out.println();
                               
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                check.put('f', check.get('f') + 1);

            } else {
                check.put('t', check.get('t') + 1);

            }
        }
        System.out.println("t : "+check.get('t'));
        System.out.println("f : "+check.get('f'));
        if(check.get('f')>1){
            return false;
        }
        return true;
    }
}