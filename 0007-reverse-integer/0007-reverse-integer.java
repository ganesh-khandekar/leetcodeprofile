class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x *= -1;
        }
        long res = 0;
        while (x > 0) {
            int temp = x % 10;
            x /= 10;
            res = (res * 10) + temp;
        }
        System.out.println(res);
        if (Integer.MAX_VALUE <= res) {
            return 0;
        }
        if (flag) {
            res *= -1;
        }
        return (int) res;
    }
}