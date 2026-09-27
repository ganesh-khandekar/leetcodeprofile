class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || 0 == x % 10) {
            return false;
        }
        int res = 0;
        int temp = x;
        while (temp > 0) {
            res = (res * 10) + temp % 10;
            temp /= 10;
        }
        if (x == res) {
            return true;
        }
        return false;

    }
}