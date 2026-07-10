class Solution {
public:
    void update(vector<int*> last) {}
    vector<int> plusOne(vector<int>& digits) {
        int count = 0;
        for (int p : digits) {
            if (p == 9) {
                count++;
            }
        }
        if (count == digits.size()) {
            digits[0] = 1;
            for (int i = 1; i < digits.size(); i++) {
                digits[i] = 0;
            }
            digits.push_back(0);
            return digits;
        } else {
            digits[digits.size() - 1]++;
        }

        for (int i = (digits.size() - 1); i > 0; i--) {
            if (digits[i] >= 10) {

                digits[i] = digits[i] - 10;
                digits[i - 1]++;
            }
        }

        return digits;
    }
};