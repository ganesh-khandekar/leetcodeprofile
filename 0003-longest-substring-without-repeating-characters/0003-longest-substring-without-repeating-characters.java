class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 1, size = 1;
        if (s.isEmpty()) {
            return 0;
        } else {
            String check = " " + s.charAt(0);
            while (i < s.length() && j < s.length()) {
                if (check.contains(" " + s.charAt(j))) {

                    i++;
                    check = " " + s.charAt(i);
                    j = i;
                    j++;
                } else {
                    if ((j - i) >= size) {
                        size = j - i + 1;
                    }
                    check = check + " " + s.charAt(j);
                    j++;
                }
            }
        }
        return size;
    }
}