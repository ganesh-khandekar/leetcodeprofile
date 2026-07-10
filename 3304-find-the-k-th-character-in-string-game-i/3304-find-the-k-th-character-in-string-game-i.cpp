class Solution {
public:
    char kthCharacter(int k, string ms = "a") {
        if (ms.length() >= k) {
            return char(ms[k - 1]);
        }
        string copy = ms;
        for (int i = 0; i < ms.length(); i++) {
            copy[i] = char(ms[i] + 1);
        }
        ms = ms + copy;

        return kthCharacter(k, ms);
    }
};