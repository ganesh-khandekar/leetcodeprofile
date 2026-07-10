class Solution {
public:
    string intToRoman(int num) {
        vector<int> nums;
        string roman;

        while (num != 0) {
            nums.push_back(num % 10);
            num /= 10;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (i == 0) {
                switch (nums[i]) {
                case 1:
                    roman = 'I' + roman;
                    break;
                case 2:
                    roman = "II" + roman;
                    break;
                case 3:
                    roman = "III" + roman;
                    break;
                case 4:
                    roman = "IV" + roman;
                    break;
                case 5:
                    roman = 'V' + roman;
                    break;
                case 6:
                    roman = "VI" + roman;
                    break;
                case 7:
                    roman = "VII" + roman;
                    break;
                case 8:
                    roman = "VIII" + roman;
                    break;
                case 9:
                    roman = "IX" + roman;
                    break;
                }

            } else if (i == 1) {
                switch (nums[i]) { 
                case 1:
                    roman = 'X' + roman;
                    break;
                case 2:
                    roman = "XX" + roman;
                    break;
                case 3:
                    roman = "XXX" + roman;
                    break;
                case 4:
                    roman = "XL" + roman;
                    break;
                case 5:
                    roman = 'L' + roman;
                    break;
                case 6:
                    roman = "LX" + roman;
                    break;
                case 7:
                    roman = "LXX" + roman;
                    break;
                case 8:
                    roman = "LXXX" + roman;
                    break;
                case 9:
                    roman = "XC" + roman;
                    break;
                }
            } else if (i == 2) {
                switch (nums[i]) { 
                case 1:
                    roman = 'C' + roman;
                    break;
                case 2:
                    roman = "CC" + roman;
                    break;
                case 3:
                    roman = "CCC" + roman;
                    break;
                case 4:
                    roman = "CD" + roman;
                    break;
                case 5:
                    roman = 'D' + roman;
                    break;
                case 6:
                    roman = "DC" + roman;
                    break;
                case 7:
                    roman = "DCC" + roman;
                    break;
                case 8:
                    roman = "DCCC" + roman;
                    break;
                case 9:
                    roman = "CM" + roman;
                    break;
                }
            } else if (i == 3) {
                switch (nums[i]) {
                case 1:
                    roman = 'M' + roman;
                    break;
                case 2:
                    roman = "MM" + roman;
                    break;
                case 3:
                    roman = "MMM" + roman;
                    break;
                }
            }}
            return roman;
        }
    };