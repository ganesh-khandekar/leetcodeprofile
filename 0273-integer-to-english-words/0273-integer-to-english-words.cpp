class Solution {
public:
    string digit_w(int num2){
         switch (num2) {
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            }
            return "";
    }
    string digits_word(int digit) {
        switch (digit) {
        case 1:
            return "Thousand";
        case 2:
            return "Million";
        case 3:
            return "Billion";
        case 4:
            return "Trillion";
        }
        return "";
    }
    string digit_word(int num, int digit1) {
        if (digit1 == 1) {
            switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            }
        } else if (digit1 == 2) {
            switch (num) {
            case 1:
                return "Ten";
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            }
        } else {
            switch (num) {
            case 1:
                return "One Hundred";
            case 2:
                return "Two Hundred";
            case 3:
                return "Three Hundred";
            case 4:
                return "Four Hundred";
            case 5:
                return "Five Hundred";
            case 6:
                return "Six Hundred";
            case 7:
                return "Seven Hundred";
            case 8:
                return "Eight Hundred";
            case 9:
                return "Nine Hundred";
            }
        }
        return "";
    }

    string Three_Digit_Word(int num1, int first = 1, string word = "", int digit1 = 0,int count=0) {
        int num2;
        if (num1 % 100 >= 11 && num1 % 100 <= 19&& count==0) {
            num2=num1%100;
             if (num1 != 0) {
                digit1=digit1+2;
                 if (first == 0) {
                        word = digit_w(num2)+ word;
                        first++;
                    } else {
                        word = digit_w(num2)+ " " + word;
                    }
                
                
             }else{
                return word;
             }
            num1 = num1 / 100;
            } else {
                count++;
                num2=num1%10;
                if (num1 != 0) {
                    digit1++;
                    if (first == 0) {
                        word = digit_word(num2, digit1) + word;
                        if(num2!=0){
                            first++;
                        }else{
                            first=0;
                        }
                        
                    } else {
                        if(num2!=0){
                            word = digit_word(num2, digit1) + " " + word;
                        }
                    }
                } else {
                    return word;
                }
                num1 = num1 / 10;
            }
            return Three_Digit_Word(num1, first, word, digit1,count);
        }

        string numberToWords(int num, string word = "", int digit = 0,
                             int zero = 0, int first = 0) {
            if (num == 0 && zero == 0) {
                return "Zero";
            } else if (num == 0) {
                return word;
            }
            if (digit != 0&&num % 1000!=0) {
                if(word==""){
                    word = digits_word(digit) +  word;
            }else{
                word = digits_word(digit) + " " + word;
            }
                
                word = Three_Digit_Word(num % 1000) + word;
            } else {
                word = Three_Digit_Word(num % 1000, 0) + word;
            }

            return numberToWords(num / 1000, word, ++digit, ++zero);
        }
    };