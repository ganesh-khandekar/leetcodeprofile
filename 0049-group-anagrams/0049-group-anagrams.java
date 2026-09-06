class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        String[] strsTemp = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            strsTemp[i] = new String(chars);
        }
        HashSet<String> temp = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {

            if (!temp.contains(strsTemp[i])) {

                temp.add(strsTemp[i]);
                List<String> resTemp = new ArrayList<>();
                for (int j = i; j < strs.length; j++) {
                    if(strsTemp[i].equals(strsTemp[j])){
                        
                        resTemp.add(strs[j]);
                    }
                }
               
                res.add(new ArrayList<>(resTemp));
            }
        }

        return res;
    }
}